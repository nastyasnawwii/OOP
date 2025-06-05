package Lab5.task7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String[] elements = {"🍒", "🍋", "🍊", "🏆", "⚓️"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 100;
        double bet;
        double win;
        String game;
        System.out.println("Welcome to the slot machine game!");
        System.out.println("The game may contain the following symbols: " + String.join(", ", elements));
        System.out.println("Rules:");
        System.out.println("- 3 matching symbols: BIG win!");
        System.out.println("- 2 matching symbols: Small win.");

        do {
            System.out.println("Your current balance: " + balance);
            System.out.print("Enter your bet: ");
            bet = scanner.nextDouble();
            scanner.nextLine();
            if(bet <= 0 || bet > balance){
                System.out.println("Invalid bet, try again");
            } else {
                balance -= bet;
                String[] result = spinRow();
                printRow(result);
                win = getPayOut(result, bet);
                balance += win;

                if (win > 0) {
                    System.out.println("You won: " + win);
                } else {
                    System.out.println("No match. You lost: " + bet);
                }

                System.out.println("Your balance after this round is " + balance);
            }

            if (balance <= 0) {
                System.out.println(" Your balance is 0. Game over!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            game = scanner.nextLine().trim().toUpperCase();
        } while (game.equals("Y") && balance > 0);
    }

    static String[] spinRow(){
        Random random = new Random();
        String[] randomElements = new String[3];
        for (int i = 0; i < randomElements.length; i++){
            randomElements[i] = elements[random.nextInt(elements.length)];
        }
        return randomElements;
    }

    static void printRow(String[] row){

        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i]);
            if (i != row.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();
    }

    static double getPayOut(String[] row, double bet){
        boolean isEqual = true;
        for (int i = 0; i < row.length - 1; i++) {
            if (!row[i].equals(row[i + 1])) {
                isEqual = false;
                break;
            }
        }

        if (isEqual){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🏆" -> bet * 10;
                case "⚓️" -> bet * 100;
                default -> 0;
            };
        }

        boolean isEqual2 = false;
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = i + 1; j < row.length; j++) {
                if (row[i].equals(row[j])) {
                    isEqual2 = true;
                    break;
                }
            }
        }

        if (isEqual2) {
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🏆" -> bet * 5;
                case "⚓️" -> bet * 6;
                default -> 0;
            };
        }
        return 0;
    }
}