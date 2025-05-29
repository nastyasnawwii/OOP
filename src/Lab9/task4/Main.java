package Lab9.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3, 8);

        Shape[] shapes = new Shape[]{circle, rectangle};
        for (Shape shape : shapes){
            System.out.println("Area: " + shape.area());
        }
    }
}