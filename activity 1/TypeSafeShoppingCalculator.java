
public class TypeSafeShoppingCalculator {

    public static void main(String[] args) {

        // Declare and initialize variables
        int quantity = 3;
        double unitPrice = 30.00;
        String storeName = "Super Shop";

        // Compute the total cost
        // totalCost should not be an int because the price may include decimal values.
        double totalCost = quantity * unitPrice;

        // Print the itemized summary
        System.out.println("===== SHOPPING SUMMARY =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Cost: PHP " + totalCost);
    }
}
