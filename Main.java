import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CONSTANTS
        final double CM_PER_INCH = 2.54;


        Scanner in = new Scanner(System.in);

        System.out.println("Please enter number of inches: ");
        double inches = in.nextDouble();

        double centimeters = inches * CM_PER_INCH;

        System.out.println(inches + " inches is equal to " + centimeters + " centimeters");
    }
}
