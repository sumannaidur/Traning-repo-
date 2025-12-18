package HotelManagementSystem;

public class Customer {
    int roomNo;
    String name;
    String phone;
    String roomType;

    public Customer(int roomNo, String name, String phone, String roomType) {
        this.roomNo = roomNo;
        this.name = name;
        this.phone = phone;
        this.roomType = roomType;
    }

    public void display() {
        System.out.println("Room No: " + roomNo);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Room Type: " + roomType);
        System.out.println("----------------------");
    }
}

