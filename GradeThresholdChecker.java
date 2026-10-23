package javaapplication9;


import java.util.Scanner;

public class GradeThresholdChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter average grade: ");
        double average = input.nextDouble();

        System.out.print("Enter number of absences: ");
        int absences = input.nextInt();

        if ((average >= 75 && absences <= 3) || average >= 90) {
            System.out.println("PASS");
            System.out.println("Reason: You meet the grade requirements.");
        } else {
            System.out.println("FAIL");
            System.out.println("Reason: You do not meet the requirements.");
        }

        input.close();
    }
}
