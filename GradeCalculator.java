
// Evan Knudsen

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompting user for numeric grade
        System.out.println("Enter your numeric grade: ");

        // Getting numeric grade from input
        double numericGrade = in.nextDouble();

        // Going through each range of grades and asking for a valid grade if the entered grade lies outside ranges
        if ((numericGrade <= 100.0) && (numericGrade >= 92.0)) {
            System.out.println("Your grade is A");
        } else if ((numericGrade < 92.0) && (numericGrade >= 89.0)) {
            System.out.println("Your grade is A-");
        } else if ((numericGrade < 89.0) && (numericGrade >= 87.0)) {
            System.out.println("Your grade is B+");
        } else if ((numericGrade < 87.0) && (numericGrade >= 82.0)) {
            System.out.println("Your grade is B");
        } else if ((numericGrade < 82.0) && (numericGrade >= 79.0)) {
            System.out.println("Your grade is B-");
        } else if ((numericGrade < 79.0) && (numericGrade >= 77.0)) {
            System.out.println("Your grade is C+");
        } else if ((numericGrade < 77.0) && (numericGrade >= 72.0)) {
            System.out.println("Your grade is C");
        } else if ((numericGrade < 72.0) && (numericGrade >= 69.0)) {
            System.out.println("Your grade is C-");
        } else if ((numericGrade < 69.0) && (numericGrade >= 67.0)) {
            System.out.println("Your grade is D+");
        } else if ((numericGrade < 67.0) && (numericGrade >= 60.0)) {
            System.out.println("Your grade is D");
        } else if ((numericGrade < 60.0) && (numericGrade >= 0)) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Please enter a valid grade");
        }
    }
}
