
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        int a = 5, b = 3, c = 2;

        // PREDICTED: 11
        int result1 = a + b * c;
        System.out.println("Expression 1: " + result1);
        // Multiplication happens before addition, so 5 + (3 * 2) = 11.

        // PREDICTED: true
        boolean result2 = a + b > c * 3 && a > b;
        System.out.println("Expression 2: " + result2);
        // Arithmetic happens before relational comparisons, then && evaluates the conditions.

        int x = 4;

        // PREDICTED: 13
        int result3 = x++ + 2 * ++x;
        System.out.println("Expression 3: " + result3);
        // x++ uses 4, then x becomes 5. ++x makes x 6 before using it.
        // Therefore, 4 + (2 * 6) = 16, not 13.
        // Correction: the actual result is 16 because multiplication comes before addition.

        System.out.println("Final x: " + x);
    }
}
