package Shapes;

public class ShapeDriver {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        System.out.println(circle.calculateArea(4));
        System.out.println(circle.calculatePerimeter(4));

        System.out.println(triangle.calculateArea(2, 4));
        System.out.println(triangle.calculatePerimeter(2, 2, 2));
    }
}
