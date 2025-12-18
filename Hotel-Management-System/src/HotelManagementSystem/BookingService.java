package HotelManagementSystem;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingService {

    static ArrayList<Customer> customers = new ArrayList<>();
    static int roomCounter = 101;

    public static void bookRoom(Scanner sc) {

        try {
            System.out.print("Enter Customer Name: ");
            String name = sc.next();

            if (!name.matches("[a-zA-Z]{2,}")) {
                throw new InvalidNameException(
                        "Name must contain only alphabets and at least 2 characters"
                );
            }

            System.out.print("Enter Phone Number: ");
            String phone = sc.next();

            if (!phone.matches("\\d{10}")) {
                throw new InvalidPhoneNumberException(
                        "Phone number must be exactly 10 digits"
                );
            }

            System.out.println("Select Room Type:");
            System.out.println("1. Single Room (1 Person)");
            System.out.println("2. Double Room (2 Persons)");
            System.out.print("Enter choice: ");

            int roomChoice = sc.nextInt();
            String roomType;

            if (roomChoice == 1) {
                roomType = "Single";
            } else if (roomChoice == 2) {
                roomType = "Double";
            } else {
                throw new InvalidRoomTypeException(
                        "Room for 3 or more members is not applicable"
                );
            }

            Customer c = new Customer(roomCounter++, name, phone, roomType);

            // Optional: keep ArrayList
            customers.add(c);

            // ✅ Save to MySQL
            saveCustomerToDB(c);

            System.out.println("Room Booked Successfully!");
            System.out.println("Room Number: " + c.roomNo);
            System.out.println("Room Type: " + roomType);

        } catch (InvalidNameException |
                 InvalidPhoneNumberException |
                 InvalidRoomTypeException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void saveCustomerToDB(Customer c) {

        String sql = "INSERT INTO customers (room_no, name, phone, room_type) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, c.roomNo);
            ps.setString(2, c.name);
            ps.setString(3, c.phone);
            ps.setString(4, c.roomType);

            ps.executeUpdate();
            System.out.println("Customer saved to database");

        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }

    // Optional: ArrayList-based view
    public static void viewCustomers() {

        if (customers.isEmpty()) {
            System.out.println("No customer records found.");
            return;
        }

        System.out.println("------ Customer Records ------");

        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).display();
            if (i < customers.size() - 1) {
                System.out.println("----------------------");
            }
        }
    }
}
