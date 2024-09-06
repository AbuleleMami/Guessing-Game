package numberguessinggame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit tests for the Game class.
 */
public class GameTest
{
    private Game game;

    /**
     * Sets up a Game instance for testing.
     */
    @Before
    public void setUp()
    {
        game = new Game(50); // Example number to guess
    }

    /**
     * Tests the getAttempts method.
     */
    @Test
    public void testGetAttempts()
    {
        assertEquals(0, game.getAttempts());
    }

    /**
     * Tests the incrementAttempts method.
     */
    @Test
    public void testIncrementAttempts()
    {
        game.incrementAttempts();
        assertEquals(1, game.getAttempts());
    }

    /**
     * Tests the isCorrectGuess method.
     */
    @Test
    public void testIsCorrectGuess()
    {
        assertTrue(game.isCorrectGuess(50));
        assertFalse(game.isCorrectGuess(30));
    }

    /**
     * Tests the isGuessHigher method.
     */
    @Test
    public void testIsGuessHigher()
    {
        assertTrue(game.isGuessHigher(60));
        assertFalse(game.isGuessHigher(40));
    }

    /**
     * Tests the isGuessLower method.
     */
    @Test
    public void testIsGuessLower()
    {
        assertTrue(game.isGuessLower(40));
        assertFalse(game.isGuessLower(60));
    }
}
