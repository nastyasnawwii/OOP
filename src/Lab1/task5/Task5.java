package Lab1.task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Are you a student? (yes/no): ");
        boolean isStudent = scanner.nextLine().equalsIgnoreCase("yes");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("student: " + isStudent);
        scanner.close();
    }
}