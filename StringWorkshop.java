
// Evan Knudsen

import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Starting prompt with userString being gathered from input
        System.out.println("Hello there! Enter a starting string below: ");
        String userString = in.next();

        while (true) {
            // Menu options list, with a space at the top for readability
            System.out.print("""
                                    
                    Pick an option below by selecting a number:
                    1. Add content
                    2. Check if the string contains a certain substring
                    3. Output length of string
                    4. Output the substring after a prefix
                    5. Output the substring before a suffix
                    6. Output the substring between a prefix and suffix
                    7. Input a new string
                    8. View the current string
                    9. Exit the program
                    """);

            int menuOption = in.nextInt();

            if (menuOption == 1) {
                System.out.println("What would you like to add to the string?");

                // Adding the entered string to the existing string using concatenation
                userString = userString.concat(in.next());
                System.out.println("""
                        Added!
                        Current String:""" + ' ' + userString);

            } else if (menuOption == 2) {
                System.out.println("What substring would you like to check for?");
                String userSubstring = in.next();

                // Using the .contains() function to check if the existing string contains the requested substring
                if (userString.contains(userSubstring)) {
                    System.out.println("Yep, the string does contain " + userSubstring);
                } else {
                    System.out.println("Nope, the string does not contain " + userSubstring);
                }

            } else if (menuOption == 3) {

                // Using the .length() function to return the length of the existing string
                System.out.println("The length of the string is: " + userString.length());

            } else if (menuOption == 4) {
                System.out.println("Prefix: ");
                String prefix = in.next();

                /*
                Using indexOf and length functions to get the index of the last character of the prefix in relation to
                the existing string
                 */
                int prefixEndIndex = userString.indexOf(prefix) + prefix.length();

                /*
                If the index of the last character of the prefix is greater than or equal to 0 (if it is within the
                existing string) and if the end of the prefix is not the end of the existing string then the
                rest of the string after the prefix is assigned and outputted, else an error message is outputted
                 */
                if ((prefixEndIndex >= 0) && (prefixEndIndex < userString.length() - 1)) {
                    String substring = userString.substring(prefixEndIndex);
                    System.out.println("Substring: " + substring);
                } else {
                    System.out.println("The string either does not contain the prefix or there are no characters after it.");
                }

            } else if (menuOption == 5) {
                System.out.println("Suffix: ");
                String suffix = in.next();

                /*
                If the suffix is not the beginning of the string and the string contains the suffix, the substring
                before the suffix is assigned and outputted, else an error message is outputted
                 */
                if (userString.indexOf(suffix) > 0) {
                    String substring = userString.substring(0, userString.indexOf(suffix));
                    System.out.println("Substring: " + substring);
                } else {
                    System.out.println("The string either does not contain the suffix or there are no characters before it.");
                }

            } else if (menuOption == 6) {
                System.out.println("Prefix: ");
                String prefix = in.next();
                System.out.println("Suffix: ");
                String suffix = in.next();

                // Assigning the end of the prefix and the beginning of the suffix
                int endOfPrefix = userString.indexOf(prefix) + prefix.length() - 1;
                int beginningOfSuffix = userString.indexOf(suffix);

                /*
                If the end of the prefix is not the end of the string, and the beginning of the suffix is not the
                beginning of the string, the substring() function is used to isolate the middle substring, else an
                error message is outputted
                 */
                if ((endOfPrefix < userString.length() - 1) && (beginningOfSuffix > 0)) {
                    String substring = userString.substring(endOfPrefix + 1, beginningOfSuffix);
                    System.out.println("Substring: " + substring);
                } else {
                    System.out.println("""
                            The string either does not contain the prefix and/or the suffix, or there are no
                            characters in between the two of them. Check to make sure you have entered the two
                            in the right order""");
                }

            } else if (menuOption == 7) {

                // An option to enter a completely new string
                System.out.println("Enter the new string: ");
                userString = in.next();

            } else if (menuOption == 8) {

                // A nice way to see the current string before continuing in the menu
                System.out.println("Current string: " + userString);

            } else if (menuOption == 9) {

                // Program ending option
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Please enter a valid menu option.");
            }
        }
    }
}
