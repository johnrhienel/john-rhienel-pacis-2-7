
import java.util.Scanner;

public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double discountRate;
        String discountTier;

        if (purchaseAmount >= 10000) {
            discountRate = 0.15;
            discountTier = "15% Discount";
        } else if (purchaseAmount >= 5000) {
            discountRate = 0.10;
            discountTier = "10% Discount";
        } else if (purchaseAmount >= 1000) {
            discountRate = 0.05;
            discountTier = "5% Discount";
        } else {
            discountRate = 0.00;
            discountTier = "No Discount";
        }

        double discount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discount;

        System.out.println("Discount Tier: " + discountTier);
        System.out.printf("Discount Amount: %.2f%n", discount);
        System.out.printf("Final Price: %.2f%n", finalPrice);

        input.close();
    }
}
