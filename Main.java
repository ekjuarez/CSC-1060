import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello! Please enter 3 integers below!");

        System.out.println("First integer: ");
        int firstNumber = in.nextInt();

        System.out.println("Second integer:");
        int secondNumber = in.nextInt();

        System.out.println("Third integer: ");
        int thirdNumber = in.nextInt();

        int greatestNum = greatestNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("The greatest number of the three is: " + greatestNum);
        System.out.println("Goodbye!");


    }
    public static int greatestNumber(int first, int second, int third) {
        int greatestNum = 0;
        if (first > second) {
            greatestNum = first;
        } else {
            greatestNum = second;
        }
        if (third > greatestNum) {
            greatestNum = third;
        }
        return greatestNum;
    }
}

