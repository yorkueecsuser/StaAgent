import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyThreadTest {
    BuggyThread buggyThread = new BuggyThread();

    @Test
    public void testShowBug() {
        try {
            buggyThread.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
        } catch (AssertionError e) {
            fail("Expected the bug to be triggered but it was not");
        }
    }
}