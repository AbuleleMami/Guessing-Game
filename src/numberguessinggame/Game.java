package numberguessinggame;

/**
 * Represents the game logic for a number guessing game.
 */
public class Game
{
    private int numberToGuess;
    private int attempts;

    /**
     * Initializes the game with a number to guess.
     * @param numberToGuess The number to be guessed in the game.
     */
    public Game(int numberToGuess)
    {
        this.numberToGuess = numberToGuess;
        this.attempts = 0;
    }

    /**
     * Gets the number of attempts made.
     * @return The number of attempts.
     */
    public int getAttempts()
    {
        return attempts;
    }

    /**
     * Increments the number of attempts by one.
     */
    public void incrementAttempts()
    {
        this.attempts++;
    }

    /**
     * Checks if the provided guess is correct.
     * @param guess The number guessed.
     * @return True if the guess is correct, otherwise false.
     */
    public boolean isCorrectGuess(int guess)
    {
        return guess == numberToGuess;
    }

    /**
     * Checks if the provided guess is higher than the number to guess.
     * @param guess The number guessed.
     * @return True if the guess is higher, otherwise false.
     */
    public boolean isGuessHigher(int guess)
    {
        return guess > numberToGuess;
    }

    /**
     * Checks if the provided guess is lower than the number to guess.
     * @param guess The number guessed.
     * @return True if the guess is lower, otherwise false.
     */
    public boolean isGuessLower(int guess)
    {
        return guess < numberToGuess;
    }
}
