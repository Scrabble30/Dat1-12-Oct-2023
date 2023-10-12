package Task4;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());

        ShapeBuilder builder = new ShapeBuilder();
        builder.addShape(circle);
        builder.addShape(square);

        System.out.println("Total Area: " + builder.getTotalArea());
    }
}
