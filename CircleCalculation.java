
import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {

        // Get that scanner going
        Scanner in = new Scanner(System.in);

        // Initial greeting and prompt for radius
        System.out.println("Hello! Please enter the radius of the circle! ");

        // Getting value from input and assigning it to the variable "radius"
        double radius = in.nextDouble();

        // Creating instances of each method then assigning the returned values to variables
        double diameter = computeDiameter(radius);
        double area = computeArea(radius);
        double circumference = computeCircumference(radius);

        // Displaying all calculated values to output
        System.out.print("Alright! Your calculated values are as follows:\n" +
                "Diameter: " + diameter + "\n" +
                "Area: " + area + "\n" +
                "Circumference: " + circumference + "\n" +
                "Have a nice day!");
    }

    public static double computeDiameter(double radius) {
        return radius * 2;
    }

    public static double computeArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static double computeCircumference(double radius) {

        // Using an instance of computeDiameter to streamline calculation process
        double diameter = computeDiameter(radius);
        return diameter * Math.PI;
    }
}
