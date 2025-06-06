package Lab11.task3;

import Lab11.task3.handlers.TaskHandler;
import Lab11.task3.services.TaskManager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        TaskHandler taskHandler = new TaskHandler(taskManager);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            // we can use this to exit APP
            if (choice == 0) {
                System.out.println("👋 Exiting To-Do List App. Have a great day!");
                break;
            }
            taskHandler.handleUserChoice(choice);
        }
    }
    private static void displayMenu() {
        System.out.println("\nTo-Do List App");
        System.out.println("1. Add Task");
        System.out.println("2. Add Recurring Task");
        System.out.println("3. Add High-Priority Task");
        System.out.println("4. List Tasks");
        System.out.println("5. Mark Task as Done");
        System.out.println("6. Delete Task");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }
}