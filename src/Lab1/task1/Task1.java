package Lab1.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:  ");
        int age = scanner.nextInt();
        System.out.println(age);
        scanner.close();
    }
}