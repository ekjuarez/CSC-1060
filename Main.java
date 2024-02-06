import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the radius of the cylinder: ");
        double radius = in.nextDouble();

        System.out.println("Please enter the length of the cylinder: ");
        double length = in.nextDouble();

        double area = computeArea(radius);
        double volume = computeVolume(radius, length);


    }

    public static double computeArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static double computeVolume(double area, double length) {
        return area * length;
    }
}

