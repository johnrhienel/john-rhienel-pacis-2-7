
import java.util.Arrays;
import java.util.Scanner;

public class SearchSortMiniTool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = {85, 92, 76, 90, 88, 70};

        System.out.println("Original Scores: "
                + Arrays.toString(scores));

        System.out.print("Enter score to search: ");
        int target = input.nextInt();

        // Linear search
        int index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Score found at index: " + index);
        } else {
            System.out.println("Score not found.");
        }

        // Sort a copy to preserve the original array.
        // The original order may be needed by other parts
        // of the program.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Array: "
                + Arrays.toString(scores));
        System.out.println("Sorted Copy: "
                + Arrays.toString(sortedScores));

        input.close();
    }
}

