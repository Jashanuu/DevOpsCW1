import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class NumberGuessingTest {

    @Test
    public void testValidInputRunsWithoutError() {
        String input = "10\n20\n30\n40\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        NumberGuessing.guessingNumberGame(); // should not crash
    }

    @Test
    public void testInvalidInputIsHandled() {
        String input = "abc\n10\n20\n30\n40\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        NumberGuessing.guessingNumberGame(); // should handle invalid input and finish
    }
}
