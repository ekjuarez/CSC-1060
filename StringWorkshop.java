
// Evan Knudsen

import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello there! Enter a starting string below: ");

        while (true) {
            String userString = in.next();

            System.out.print("""
                Pick an option below by selecting a number:
                1. Add content
                2. Check if the string contains a certain substring
                3. Output length of string
                4. Output the substring after a prefix
                5. Output the substring before a suffix
                6. Output the substring between a prefix and suffix
                7. Input a new string
                8. Exit the program""");
        }
    }
}
