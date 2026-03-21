import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: Values should not be uselessly incremented
        int result = bugExample.showBug(); // Line 12

        // Expected value is 1, but since the bug is present, it will return 0
        assertEquals(1, result);
    }
}