
// Evan Knudsen

import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("""
                Just enter as many integers below as you wish and when you enter 0, I will provide the sum of all
                of those integers:""");
        int sum = 0;

        while (true) {
            System.out.println("Number: ");
            int number = in.nextInt();
            sum += number;

            if (number == 0) {
                System.out.println("Your sum is: " + sum);
                System.out.println("Goodbye");
                break;
            }
        }
    }
}
