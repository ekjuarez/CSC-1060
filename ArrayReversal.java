
// Evan Knudsen

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Beginning prompt
        System.out.println("Enter integers below (-1 to stop):");

        // Creating an ArrayList to allow for easy and efficient adding of new values, with dynamic length
        ArrayList<Integer> userArray = new ArrayList<>();

        while (true) {

            // Getting each number from input
            int currentNumber = in.nextInt();

            // If the number entered is -1, ending prompting. This is done first so -1 is not added as a value
            if (currentNumber == -1) {
                break;
            }
            // Easy .add method to add each number to the end of the ArrayList
            userArray.add(currentNumber);
        }
        System.out.println("Your values, reversed: ");

        /*
        A for loop starting at the length of the ArrayList -1, which is just the last index, then decrementing
        through it one at a time and printing each value. This way results in numbers being printed neatly in the same
        layout as the user entered numbers in previously
         */
        for (int i = userArray.toArray().length - 1; i >= 0; i -= 1) {
            System.out.println(userArray.toArray()[i]);
        }
    }
}
