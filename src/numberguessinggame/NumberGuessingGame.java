package numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 * A number guessing game that extends the basic game logic.
 */
public class NumberGuessingGame extends Game
{
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    /**
     * Initializes the game with a randomly generated number.
     */
    public NumberGuessingGame()
    {
        super(generateRandomNumber());
    }

    /**
     * Generates a random number between MIN_NUMBER and MAX_NUMBER.
     * @return The randomly generated number.
     */
    private static int generateRandomNumber()
    {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }

    /**
     * Starts the game and handles user input.
     */
    public void startGame()
    {
        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");

        while (!guessedCorrectly)
        {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            incrementAttempts();

            if (isCorrectGuess(guess))
            {
                System.out.println("Congratulations! You guessed the number in " + getAttempts() + " attempts.");
                guessedCorrectly = true;
            }
            else if (isGuessHigher(guess))
            {
                System.out.println("Too high! Try again.");
            }
            else if (isGuessLower(guess))
            {
                System.out.println("Too low! Try again.");
            }
        }

        scanner.close();
    }

    /**
     * Main method to run the game.
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        NumberGuessingGame game = new NumberGuessingGame();
        game.startGame();
    }
}
