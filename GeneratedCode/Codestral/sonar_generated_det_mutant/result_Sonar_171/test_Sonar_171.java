import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    BuggyClass buggyClass = new BuggyClass();

    @Test
    public void testShowBug() {
        try {
            buggyClass.showBug();
            fail("Expected RuntimeException to be thrown"); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
        } catch (RuntimeException e) {
            // We intentionally do not handle the exception to let the test case fail
            // This is to demonstrate that the RuntimeException is not properly propagated due to the bug
        }
    }
}