
// Evan Knudsen

import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("""
                Hello, please enter a number to choose a beverage,
                (1) Water
                (2) Coke
                (3) Coffee""");

        int selection = in.nextInt();

        if (selection == 1) {
            System.out.println("You selected Water");
        } else if (selection == 2) {
            System.out.println("You selected Coke");
        } else if (selection == 3) {
            System.out.println("You selected Coffee");
        } else {
            System.out.println("Please only enter an integer that is provided above");
        }
        System.out.println("Goodbye. ");
    }
}
