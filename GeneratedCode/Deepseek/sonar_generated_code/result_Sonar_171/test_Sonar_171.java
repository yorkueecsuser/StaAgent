import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: Jump statements should not occur in "finally" blocks
    public void testDoSomethingWhichThrowsException() {
        try {
            Main.doSomethingWhichThrowsException();
            fail("Expected RuntimeException to be thrown"); // Expect the exception to be thrown
        } catch (RuntimeException e) {
            // Expect the exception message to be "Expected"
            assertEquals("Expected", e.getMessage());
        }
    }
}