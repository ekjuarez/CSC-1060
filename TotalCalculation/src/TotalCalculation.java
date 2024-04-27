
// Evan Knudsen

import java.io.*;
import java.util.Scanner;

public class TotalCalculation {
    public static void main(String[] args) throws IOException {
        File itemsFile = new File("C:\\CSC-1060\\TotalCalculation\\items.txt");
        File totalFile = new File("C:\\CSC-1060\\TotalCalculation\\total.txt");

        double salesTax = 0.053;
        double subTotal = 0;

        try (FileInputStream fileInputStream = new FileInputStream(itemsFile.getAbsolutePath())) {
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextDouble()) {
                subTotal += scanner.nextDouble();
            }
        }
        double total = (subTotal * salesTax) + subTotal;
        double taxTotal = total - subTotal;

        try (FileOutputStream fileOutputStream = new FileOutputStream((totalFile.getAbsolutePath()))) {
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.print("Sub-total before tax: $");
            printStream.printf("%.2f%n", subTotal);

            printStream.print("Total tax amount: $");
            printStream.printf("%.2f%n", taxTotal);

            printStream.print("Total amount: $");
            printStream.printf("%.2f%n", total);
        }
    }
}
