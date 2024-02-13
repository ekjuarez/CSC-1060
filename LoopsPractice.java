
import java.util.Scanner;

public class LoopsPractice {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello, please give me an integer: ");
        int userNum = in.nextInt();
        findFactorial(userNum);

        System.out.println("Next give me a number of rows and columns!");
        System.out.println("Rows: ");
        int numRows = in.nextInt();

        System.out.println("Columns: ");
        int numColumns = in.nextInt();

        hashBox(numRows, numColumns);
    }
    public static void findFactorial(int startNum) {
        int total = 1;

        for(int count = startNum; count > 0; count -= 1){
            total *= count;

        }
        System.out.println("That number factorial is: " + total);
    }
    public static void hashBox(int rows, int columns) {
        for(int columnCount = 1; columnCount <= rows; columnCount += 1) {
            for(int perRow = 1; perRow <= columns; perRow += 1){
                System.out.print("#");
                if(perRow == columns){
                    System.out.println();
                }
            }
        }
    }
}
