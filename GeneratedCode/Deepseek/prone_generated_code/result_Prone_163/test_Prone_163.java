import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample be = new BugExample();
        try {
            be.showBug(); // TRIGGER BUG: ThrowNull
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Test passes if a NullPointerException is thrown
        }
    }
}