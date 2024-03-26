package Shapes;

public class Circle extends Shapes {
    public double calculateArea(double radius) {
        return (Math.PI) * (radius * radius);
    }

    public double calculatePerimeter(double radius) {
        return (Math.PI) * (radius * 2);
    }
}    