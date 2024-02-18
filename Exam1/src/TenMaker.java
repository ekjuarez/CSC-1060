
// Evan Knudsen

import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please give me two integers and I will tell you whether their sum is 10: ");

        System.out.println("First integer: ");
        int firstNum = in.nextInt();

        System.out.println("Second integer: ");
        int secondNum = in.nextInt();

        if (makes10(firstNum, secondNum)) {
            System.out.println("The sum of those two numbers is indeed 10!");
        } else {
            System.out.println("The sum of those two numbers is not 10.");
        }
        System.out.println("Goodbye!");
    }

    public static boolean makes10(int num1, int num2) {
        int sum = num1 + num2;
        if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }
}
