
import java.util.Scanner;

public class SumUntilSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        System.out.println("Enter integers (-1 to stop):");

        System.out.print("Enter number: ");
        number = input.nextInt();

        while (number != -1) {
            total += number;

            System.out.print("Enter number: ");
            number = input.nextInt();
        }

        System.out.println("Final Total: " + total);

        input.close();
    }
}
