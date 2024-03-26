package Shapes;

public class Triangle extends Shapes {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return (base * height) / 2;
    }
    public double calculatePerimeter() {
        double sideOne = base;
        double sideTwo = Math.sqrt(((base / 2) * (base / 2)) + (height * height));
        return sideOne + sideTwo + sideTwo;
    }
}
