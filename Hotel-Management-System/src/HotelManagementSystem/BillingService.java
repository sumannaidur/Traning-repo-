package HotelManagementSystem;

public class BillingService {

    public static void generateBill(int days, String roomType) {
        int rate;

        if (roomType.equalsIgnoreCase("Single")) {
            rate = 1000;
        } else {
            rate = 2000;
        }

        int total = rate * days;
        System.out.println("Total Bill Amount: ₹" + total);
    }
}
