
public class OverflowReferenceInvestigator {
    public static void main(String[] args) {

        // 1. Primitive Overflow
        System.out.println("=== Primitive Overflow ===");

        byte number = 127; // Maximum value of a byte
        System.out.println("Before increment: " + number);

        number++; // Overflows and wraps around to -128
        System.out.println("After increment: " + number);


        // 2. String Reference Comparison
        System.out.println("\n=== String Comparison ===");

        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";

        // Compare str1 and str2
        System.out.println("str1 == str2: " + (str1 == str2));
        // false: They are two different String objects.

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        // true: Their text content is the same.

        // Compare str1 and str3
        System.out.println("str1 == str3: " + (str1 == str3));
        // false: str1 is a new object; str3 refers to the
        // String object stored in the string pool.

        System.out.println("str1.equals(str3): " + str1.equals(str3));
        // true: Both contain the text "Java".

        // Compare str2 and str3
        System.out.println("str2 == str3: " + (str2 == str3));
        // false: They refer to different String objects.

        System.out.println("str2.equals(str3): " + str2.equals(str3));
        // true: Both contain the text "Java".


        // 3. Shared Array Reference
        System.out.println("\n=== Shared Array Reference ===");

        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("Before modification:");
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array2[0] = " + array2[0]);

        // Modify the array through array2.
        array2[0] = 99;

        System.out.println("\nAfter modifying array2:");
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array2[0] = " + array2[0]);

        
    }
}
