import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggy = new BuggyCode();
        try {
            buggy.showBug(-5); // TRIGGER BUG: Calls to methods should not trigger an exception
            fail("Expected an IllegalArgumentException to be thrown"); // Expect the method to fail
        } catch(IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed!", e.getMessage()); // Check the error message
        }
    }
}