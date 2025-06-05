package Lab5.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        String choice;
        double secondNumber;

        System.out.println("*** Menu ***");
        System.out.println("Plus (+)");
        System.out.println("Minus (-)");
        System.out.println("Multiply (*)");
        System.out.println("Divide (/)");
        System.out.println("Power (^)");
        System.out.println("Exit (exit)");
        System.out.print("Enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Enter your choice (+, -, *, /, ^): ");
        choice = scanner.next();

        System.out.print("Enter second number: ");
        secondNumber = scanner.nextDouble();

        switch (choice){
            case "+":
                plus(firstNumber, secondNumber);
                break;
            case "-":
                minus(firstNumber, secondNumber);
                break;
            case "*":
                multiply(firstNumber, secondNumber);
                break;
            case "/":
                divide(firstNumber, secondNumber);
                break;
            case "^":
                power(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
    public static void plus (double firstNumber, double secondNumber){
        double result = firstNumber + secondNumber;
        System.out.println("Result is: " + result);
    }

    public static void minus (double firstNumber, double secondNumber){
        double result = firstNumber - secondNumber;
        System.out.println("Result is: " + result);
    }

    public static void multiply (double firstNumber, double secondNumber){
        double result = firstNumber * secondNumber;
        System.out.println("Result is: " + result);
    }

    public static void divide (double firstNumber, double secondNumber){
        if (secondNumber != 0){
            double result = firstNumber / secondNumber;
            System.out.println("Result is: " + result);
        }else {
            System.out.println("Division by zero is no allowed.");
            return;
        }
    }
    public static void power (double firstNumber, double secondNumber){
        double result = Math.pow(firstNumber, secondNumber);
        System.out.println("Result is: " + result);
    }
}