package Lab9.task4;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
}
