package Lab4.task5;

public class Task5 {
    public static void main(String[] args) {
        double circleArea1 = calculateArea(4.0);
        double circleArea2 = calculateArea(8.0);
        double rectangleArea1 = calculateArea(8.0, 14.0);
        double rectangleArea2 = calculateArea(4.0, 18.0);

        System.out.println("Circle area 1: " + circleArea1);
        System.out.println("Circle area 2: " + circleArea2);
        System.out.println("Rectangle area 1: " + rectangleArea1);
        System.out.println("Rectangle area 2: " + rectangleArea2);
    }
    public static double calculateArea(double radius){
        return 3.14 * radius * radius;
    }
    public static double calculateArea(double length, double width){
        return length * width;
    }
}