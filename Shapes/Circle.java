package Shapes;

public class Circle extends Shapes {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return (Math.PI) * (radius * radius);
    }
    @Override
    public double calculatePerimeter() {
        return (Math.PI) * (radius * 2);
    }
}    