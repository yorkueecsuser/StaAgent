import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample(); // Needed for the test case

    @Test
    public void testShowBug() throws InterruptedException {
        // TRIGGER BUG: "wait" should not be called when multiple locks are held
        bugExample.showBug(); // Line 10
    }
}