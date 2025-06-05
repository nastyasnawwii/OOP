package Lab5.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        while (true){
            System.out.println("========= MENU =========");
            System.out.println("1. Show current balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1–4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance += deposit(scanner);
                    break;
                case 3:
                    balance = withdraw(balance, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using our bank system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose 1–4.");
            }
        }
    }

    public static void showBalance(double balance){
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    public static double deposit(Scanner scanner){
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0){
            System.out.printf(" $%.2f deposited successfully.%n", amount);
            return amount;
        }else {
            System.out.println(" Amount must be greater than zero.");
            return 0;
        }
    }

    public static double withdraw(double balance, Scanner scanner){
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount <= 0){
            System.out.println("Amount must be greater than zero.");
        }else if (amount > balance){
            System.out.println("Insufficient funds.");
        }else {
            balance -= amount;
            System.out.printf("$%.2f withdrawn successfully.%n", amount);
        }
        return balance;
    }
}