import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        long result = bugExample.showBug(); // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        assertEquals(2147483648L, result); // This assertion will fail by design to trigger the bug
    }
}