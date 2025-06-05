package Lab5.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "1. Which planet is known as the Red Planet?",
                "2. What is the capital city of Australia?",
                "3. Who wrote the play 'Romeo and Juliet'?",
                "4. What is the chemical symbol for gold?"
        };

        String[][] answers = {
                {"a) Venus", "b) Mars", "c) Jupiter"},
                {"a) Sydney", "b) Canberra", "c) Melbourne"},
                {"a) Charles Dickens", "b) William Shakespeare", "c) Jane Austen"},
                {"a) Gd", "b) Au", "c) Ag"}
        };

        String[] correctAnswers = {"b", "b", "b", "b"};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String answer : answers[i]) {
                System.out.println(answer);
            }

            String userAnswer;
            boolean validAnswer = false;

            do {
                System.out.print("Enter your answer (a, b, or c): ");
                userAnswer = scanner.nextLine().trim().toLowerCase();

                if (userAnswer.equals("a") || userAnswer.equals("b") || userAnswer.equals("c")) {
                    validAnswer = true;
                } else {
                    System.out.println("Invalid input. Please enter only 'a', 'b', or 'c'.");
                }
            } while (!validAnswer);

            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("It's correct!");
                score++;
            } else {
                System.out.println("That's incorrect. The correct answer is: " + correctAnswers[i]);
            }
        }

        System.out.println(" Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
