import static org.junit.Assert.*; // Assertion tools for tests
import org.junit.Test;
import java.io.*;

// JUnit test class for NumberGuessing.java
public class NumberGuessingTest {

    // Test that the game runs successfully with valid integer inputs
    @Test
    public void testValidInputRunsWithoutError() {
        // Simulate valid input values for 5 guesses
        String input = "10\n20\n30\n40\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Run the game (should not crash or throw errors)
        NumberGuessing.guessingNumberGame();
    }

    // Test that the game handles invalid (non-integer) input gracefully
    @Test
    public void testInvalidInputIsHandled() {
        // First input is a string, followed by valid numbers
        String input = "abc\n10\n20\n30\n40\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Run the game (should catch the exception and prompt again)
        NumberGuessing.guessingNumberGame();
    }
}
