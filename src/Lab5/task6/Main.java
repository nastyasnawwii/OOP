package Lab5.task6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Game started!");
        String play = "yes";

        do {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();
            boolean validChoice = false;
            while (!validChoice) {
                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")){
                    validChoice = true;
                } else {
                    System.out.println("Invalid choice. Please enter rock, paper, or scissors");
                    userChoice = scanner.nextLine().toLowerCase();
                }
            }
            String[] choices = {"rock", "paper", "scissors"};
            String computerChoice = choices[random.nextInt(choices.length)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)){
                System.out.println("It`s a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("paper") && computerChoice.equals("rock") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper")) {

                System.out.println("You win!");
            }else {
                System.out.println("You lose!");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            play = scanner.nextLine().toLowerCase();
        }while (play.equals("yes"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}