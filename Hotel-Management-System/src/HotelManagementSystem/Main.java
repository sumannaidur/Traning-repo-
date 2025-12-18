package HotelManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hotel Management System ---");
            System.out.println("1. Book Room");
            System.out.println("2. View Customer Records");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BookingService.bookRoom(sc);
                    break;

                case 2:
                    BookingService.viewCustomers();
                    break;

                case 3:
                    System.out.print("Enter Room Type: ");
                    String type = sc.next();
                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();
                    BillingService.generateBill(days, type);
                    break;

                case 4:
                    System.out.println("Thank you! Visit Again.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}
