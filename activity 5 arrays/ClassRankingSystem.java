
import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name;
    int[] quizzes;
    double average;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        this.average = calculateAverage();
    }

    double calculateAverage() {
        int total = 0;

        for (int score : quizzes) {
            total += score;
        }

        return (double) total / quizzes.length;
    }
}

public class ClassRankingSystem {

    // Linear search by student name
    public static int linearSearch(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }

        return -1;
    }

    // Custom bubble sort: highest average first
    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void printLeaderboard(Student[] students) {
        System.out.println("\n========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-15s %-20s %s%n",
                "Rank", "Name", "Quiz Scores", "Average");
        System.out.println("----------------------------------------"
                + "----------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            // Equal averages receive equal ranks.
            if (i > 0 &&
                    Double.compare(students[i].average,
                                   students[i - 1].average) != 0) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-15s %-20s %.2f%n",
                    rank,
                    students[i].name,
                    Arrays.toString(students[i].quizzes),
                    students[i].average);
        }

        System.out.println("========================================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Raw quiz data: each row contains a name and four scores.
        String[] names = {"john", "Cj", "Maxine", "Gochuico", "Jay"};

        int[][] quizData = {
            {95, 90, 92, 93},
            {85, 88, 90, 87},
            {95, 90, 92, 93},
            {78, 82, 80, 85},
            {88, 91, 86, 89}
        };

        // Build an array of Student objects.
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Search before sorting.
        System.out.print("Enter student name to search: ");
        String target = input.nextLine();

        int foundIndex = linearSearch(students, target);

        if (foundIndex != -1) {
            Student found = students[foundIndex];

            System.out.println("\nStudent found!");
            System.out.println("Name: " + found.name);
            System.out.println("Quiz scores: "
                    + Arrays.toString(found.quizzes));
            System.out.printf("Average: %.2f%n", found.average);
        } else {
            System.out.println("Student not found.");
        }

        // Sort the Student objects using our own algorithm.
        sortStudents(students);

        // Print the ranked leaderboard.
        printLeaderboard(students);

        input.close();
    }
}

