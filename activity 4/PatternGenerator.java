
public class PatternGenerator {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            System.out.print("Row " + row + ": ");

            for (int col = 1; col <= 5; col++) {

                // BREAK: stop the inner loop when col reaches 4.
                if (col == 4) {
                    break;
                }

                // CONTINUE: skip printing column 3.
                if (col == 3) {
                    continue;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

