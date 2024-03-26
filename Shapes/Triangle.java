package Shapes;

public class Triangle extends Shapes {
    public double calculateArea(double base, double height) {
        return (base * height) / 2;
    }
    public double calculatePerimeter(double sideOne, double sideTwo, double sideThree) {
        return sideOne + sideTwo + sideThree;
    }
}
