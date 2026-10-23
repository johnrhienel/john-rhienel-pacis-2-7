
public class UnitCastingConverter {

    public static void main(String[] args) {

        // Declare a double value representing centimeters
        double centimeters = 275.5;

        // Explicit narrowing cast: convert centimeters to whole meters
        int wholeMeters = (int) (centimeters / 100);

        // Calculate the remaining centimeters
        double remainingCentimeters = centimeters - (wholeMeters * 100);

        System.out.println("===== UNIT CASTING CONVERTER =====");
        System.out.println("Total Centimeters: " + centimeters + " cm");
        System.out.println("Whole Meters: " + wholeMeters + " m");
        System.out.println("Remaining Centimeters: " + remainingCentimeters + " cm");

        // Implicit widening: an int can be safely converted to a double.
        int number = 25;
        double widenedNumber = number;

        System.out.println("\n===== IMPLICIT WIDENING =====");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + widenedNumber);

        // Explicit narrowing: converting double to int removes the decimal part.
        double decimalValue = 12.75;
        int narrowedValue = (int) decimalValue;

        System.out.println("\n===== EXPLICIT NARROWING =====");
        System.out.println("Original Double: " + decimalValue);
        System.out.println("Converted Integer: " + narrowedValue);
        System.out.println("Note: The decimal part (.75) is lost.");
    }
}
