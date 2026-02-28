import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingBugTest {

    @Test
    public void testGetInstance() {
        // TRIGGER BUG: Double-checked locking should not be used
        try {
            DoubleCheckedLockingBug.showBug();
        } catch (Exception e) {
            // Catching exception to trigger the bug, as the test should fail
            fail("Double-checked locking bug triggered: " + e.getMessage());
        }
    }
}