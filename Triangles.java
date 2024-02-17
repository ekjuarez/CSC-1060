
// Evan Knudsen

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Prompting user for size of triangle and continuing through the iteration if an integer outside
        the specified range is entered. Main process is inside a while loop to allow for re-prompting when necessary
         */
        while (true) {
            System.out.println("Enter the size of the triangle, but only integers between 1 and 50: ");
            int size = in.nextInt();
            if ((size <= 0) || (size > 50)) {
                System.out.println("Please only enter integers between 1 and 50. ");
                continue;
            }

            // Prompting user for the character to draw the triangle with
            System.out.println("Enter the character you want the triangle drawn with: ");
            char fill = in.next().charAt(0);

            // Looping through the method calls for each line starting on line 1 and iterating until the entered size
            for (int currentRow = 1; currentRow <= size; currentRow += 1) {
                printFillSpaces(currentRow, size);
                printCharacters(fill, currentRow);
                printFillSpaces(currentRow, size);
                System.out.println();
            }

            // Prompting for either a new triangle or to end the program, returns to the main while loop or breaks the loop
            System.out.println("Would you like to try another triangle? Just enter yes to try another or " +
                    "anything else to end the program");
            char contPrompt = in.next().charAt(0);
            if ((contPrompt != 'y') && (contPrompt != 'Y')) {
                break;
            }
        }
    }

    public static void printCharacters(char character, int numInRow) {

        /* This method prints all the characters in a row including all the spaces in between. It does not print
        any of the spaces on either side of the characters.
         */
        while (numInRow > 0) {
            System.out.print(character);
            numInRow = numInRow - 1;
            if (numInRow > 0) {
                System.out.print(" ");
            }
        }
    }

    public static void printFillSpaces(int currentRow, int numRows) {

        /* This method prints all the spaces on either side of the characters. Every row has a number of "fill spaces"
        on either side equal to the size of the triangle minus the current row from top to bottom. The first row is row
        one, so on either side of the characters there are a number of spaces equal to one less than the size of the
        triangle. Row two would have two less on either side, and so on. 
         */
        for (int numFillSpaces = numRows - currentRow; numFillSpaces >= 0; numFillSpaces -= 1) {
            System.out.print(" ");
        }
    }
}
