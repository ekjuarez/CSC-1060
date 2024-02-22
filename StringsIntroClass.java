
// Evan Knudsen
// Class notes

import java.util.Scanner;

public class StringsIntroClass {
    public static void main(String[] args) {
        String userString = "All of the goats ran and jumped";
        if (endsWith(userString, "jumped")) {
            System.out.println("Yay");
        }
    }
    public static String whitespaceBegone(String fluffyString) {

        // Can use .trim instead to be even more efficient
        return fluffyString.stripLeading().stripTrailing();


        /*
        Brute force way to accomplish this:

        int start = 0;
        while(string.charAt(start) == ' ') {
            start++;
        }

        int end = string.length() - 1;
        while (string.charAt(end) == ' ') {
            end --;
        }

         */
    }
    public static String dateFormatter(int month, int day, int year) {
        String namedMonth = "";
        if (month == 1) {
            namedMonth = "January";
        } else if (month == 2) {
            namedMonth = "February";
        } else if (month == 3) {
            namedMonth = "March";
        } else if (month == 4) {
            namedMonth = "April";
        } else if (month == 5) {
            namedMonth = "May";
        } else if (month == 6) {
            namedMonth = "June";
        } else if (month == 7) {
           namedMonth = "July";
        } else if (month == 8) {
            namedMonth = "August";
        } else if (month == 9) {
            namedMonth = "September";
        } else if (month == 10) {
            namedMonth = "October" ;
        } else if (month == 11) {
            namedMonth = "November";
        } else if (month == 12) {
            namedMonth = "December";
        }

        return String.format("Current date: %s", namedMonth);
    }
    public static boolean endsWith(String mainString, String potentialEnd) {
        return mainString.endsWith(potentialEnd);
    }
}
