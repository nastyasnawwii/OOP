package Lab3.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + i + ": ");
            array[i] = scanner.nextInt();
        }
        boolean foundDuplicate = false;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Found duplicate: " + array[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }
        if (!foundDuplicate){
            System.out.println("No duplicates found");
        }
        scanner.close();
    }
}