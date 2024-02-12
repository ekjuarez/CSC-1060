
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello! Give me that floating-point number");

        float userNum = in.nextFloat();

        signCalculator(userNum);
        sizeCalculator(userNum);

        System.out.println("Goodbye!");

    }

    public static void signCalculator(float num) {
        if (num > 0) {
            System.out.println("This number is positive!");
        } else if (num < 0) {
            System.out.println("This number is negative!");
        } else {
            System.out.println("This number is zero!");
        }
    }

    public static void sizeCalculator(float num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num < 1) {
            System.out.println("This number is small!");
        } else if (num > 1000000) {
            System.out.println("This number is large!");
        } else {
            System.out.println("This number is regular sized!");
        }
    }
}
