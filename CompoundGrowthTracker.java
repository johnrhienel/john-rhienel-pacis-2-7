
public class CompoundGrowthTracker {
    public static void main(String[] args) {

        double balance = 1000;

        System.out.println("Starting Balance: " + balance);

        balance += 500;
        System.out.println("After adding 500: " + balance);

        balance *= 2;
        System.out.println("After multiplying by 2: " + balance);

        balance += 1000;
        System.out.println("After adding 1000: " + balance);

        int count = 5;

        System.out.println("\nPostfix Increment:");
        System.out.println(count++);
        System.out.println(count);

        count = 5;

        System.out.println("\nPrefix Increment:");
        System.out.println(++count);
        System.out.println(count);

        // Postfix prints the old value before incrementing.
        // Prefix increments first, then prints the new value.
    }
}
