
import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Intro prompt for name
        System.out.println("What is your name? ");

        // Taking the user's name as input
        String user_name = in.nextLine();

        // Prompt for where user is from (birthplace)
        System.out.println("Where are you from?  ");

        // Taking in birthplace as input
        String user_birthplace = in.nextLine();

        // Prompt for user age
        System.out.println("How old are you? ");

        // Taking in age as input
        int user_age = in.nextInt();

        // Initial greeting with info
        System.out.println("Hello " + user_name + " from " + user_birthplace +
                ". You are " + user_age + " years old. Pretty old, but not as old as 26 at least");

        // Further question about personal interest
        System.out.println("What is something you like to do? ");

        in.nextLine();
        // Take in answer as input
        String user_interest = in.nextLine();

        // Warm response to interest
        System.out.println("That sounds awesome!");
        System.out.println("Have fun next time you " + user_interest + "!");

        // Asks user for donation amount
        System.out.println("How much would you like to donate today? ");

        // Gets donation amount as input
        double donation_amount = in.nextDouble();

        // Last statement with donation amount
        System.out.println("Awesome! You will donate $" + donation_amount + " today! Rockin!");
    }
}
