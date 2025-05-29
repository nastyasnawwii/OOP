package Lab9.task1;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        // Calls the method with two parameters
        System.out.println(obj.add(25, 25)); // Output: 50
        // Calls the method with three parameters
        System.out.println(obj.add(25, 25, 30)); // Output: 80
        System.out.println(obj.add(25, 20));
    }
}
