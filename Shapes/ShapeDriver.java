package Shapes;

public class ShapeDriver {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(4, 4);

        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
    }
}
