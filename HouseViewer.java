
import java.util.Scanner;

public class HouseViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        House home = new House("blue", 4, 1980);

        System.out.println("What color do you want to paint the house?");
        String userColor = in.next();

    }
}
