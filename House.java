
import java.util.Scanner;
public class House {
    public String color;
    public int numberOfRooms;
    public final int yearBuilt;

    // Constructor
    public House (String color, int numberOfRooms, int yearBuilt) {
        this.color = color;
        this.numberOfRooms = numberOfRooms;
        this.yearBuilt = yearBuilt;
    }
    public String paintHouse(String newColor) {
        return this.color = newColor;
    }
    public void referenceBuildYear() {
        System.out.println("The house was built in " + this.yearBuilt);
    }
}
