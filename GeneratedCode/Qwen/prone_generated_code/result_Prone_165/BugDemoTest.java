import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBugFails() {
        BugDemo demo = new BugDemo();
        try {
            demo.showBug(); // TRIGGER BUG: TryFailThrowable
            fail("Expected an exception to be thrown"); // This fail() call will be caught by the Throwable catch block, causing the test to pass incorrectly
        } catch (IllegalArgumentException e) {
            // Expected exception caught, test should pass
        }
    }
}