package Lab11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> taskStatus = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("======== Меню ========");
            System.out.println("1. Всі задачі.");
            System.out.println("2. Додати нову задачу.");
            System.out.println("3. Позначити задачу як виконанну.");
            System.out.println("4. Видалити задачу.");
            System.out.println("5. Вийти з програми.");
            System.out.print("Виберіть опцію зі списку: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (tasks.isEmpty()) {
                        System.out.println("Список задач порожній.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = taskStatus.get(i) ? "[Виконано] " :
                                    "[В очікуванні] ";
                            System.out.println((i + 1) + ". " + status +
                                    tasks.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Введіть задачу: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    taskStatus.add(false);
                    System.out.println("Завдання додано успішно!");
                    break;
                case 3:
                    System.out.print("Введіть номер задачі, яку хочете відмітити як виконану: ");
                    int doneIndex = scanner.nextInt() - 1;
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        taskStatus.set(doneIndex, true);
                        System.out.println("Завдання відмічено успішно!");
                    } else {
                        System.out.println("Неправильно введено номер задачі.");
                    }
                    break;
                case 4:
                    System.out.print("ВВедіть номер задачі, яку хочете видалити: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        taskStatus.remove(deleteIndex);
                        System.out.println("Задача видалена!");
                    } else {
                        System.out.println("Неправильний номер задачі.");
                    }
                    break;
                case 5:
                    System.out.println("Вихід...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Нерокетний вибір, спробуйте ще раз.");

            }
        }
    }
}

