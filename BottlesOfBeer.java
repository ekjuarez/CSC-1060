
// Evan Knudsen

import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Initial prompt and gathering starting number from input
        System.out.println("Hello, enter the number of bottles to start: ");
        int startNum = in.nextInt();

        // A for loop setting the current bottle equal to the entered starting number, then decrementing the count until 0
        for (int currentBottle = startNum; currentBottle >= 0; currentBottle -= 1) {

            // Assigning a variable for the next value in the process in order to print the second part of the jingle
            int nextBottle = currentBottle - 1;

            // An if statement for handling anything above 1 to match pluralization and such
            if (currentBottle > 1) {
                System.out.println(currentBottle + " bottles of beer on the wall, " + currentBottle + " bottles of beer.\n" +
                        "Take one down and pass it around, " + nextBottle + " bottles of beer on the wall.");
                System.out.println();

                // Else if to handle when there is only 1 bottle in order to have correct word usage
            } else if (currentBottle == 1) {
                System.out.println(currentBottle + " bottle of beer on the wall, " + currentBottle + " bottle of beer.\n" +
                        "Take one down and pass it around, " + nextBottle + " bottles of beer on the wall.");
                System.out.println();

                // Different jingle for when there are no more bottles left
            } else if (currentBottle == 0) {
                System.out.println(currentBottle + " bottles of beer on the wall, " + currentBottle + " bottles of beer.\n" +
                        "Go to the store and buy some more, " + startNum + " bottles of beer on the wall.");

                // Else statement in case of any unintended input that is not filtered out by the original for statement
            } else {
                System.out.println("Sorry, that is not a valid number of bottles.");
            }
        }
    }
}