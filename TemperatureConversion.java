// Temperature Converter from Fahrenheit to Celsius then to Kelvin
// Evan Knudsen

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // CONSTANTS
        final double FREEZING_POINT_WATER_IN_F = 32;
        final double MELTING_POINT_ICE_IN_K = 273.15;

        Scanner in = new Scanner(System.in);

        // Intro request for Fahrenheit
        System.out.println("Please enter temperature in Fahrenheit: ");

        // Taking in Fahrenheit from input
        double fahrenheit = in.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsius = ((fahrenheit - FREEZING_POINT_WATER_IN_F) * 5) / 9;

        // Converting Celsius to Kelvin
        double kelvin = celsius + MELTING_POINT_ICE_IN_K;

        // Sexy output statements using concatenation
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        System.out.println(celsius + " degrees celsius is equal to " + kelvin + " degrees Kelvin");
    }
}
