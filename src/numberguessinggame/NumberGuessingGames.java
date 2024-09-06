package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGames extends Game {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public NumberGuessingGames() {
        super(generateRandomNumber());
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            incrementAttempts();

            if (isCorrectGuess(guess)) {
                System.out.println("Congratulations! You guessed the number in " + getAttempts() + " attempts.");
                guessedCorrectly = true;
            } else if (isGuessHigher(guess)) {
                System.out.println("Too high! Try again.");
            } else if (isGuessLower(guess)) {
                System.out.println("Too low! Try again.");
            }
        }
        scanner.close();
    }
}
