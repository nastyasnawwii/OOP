package Lab9.task4;

public class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
