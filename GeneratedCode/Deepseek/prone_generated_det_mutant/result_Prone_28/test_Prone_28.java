import org.junit.Test;
import static org.junit.Assert.*;

public class ConstantOverflowTest {
    ConstantOverflow co = new ConstantOverflow();

    @Test
    public void showBugTest() {
        // Expected value
        long expected = -1857093632L;
        // Actual value
        long actual = co.showBug();
        // Check if the actual value is equal to the expected value
        assertEquals(expected, actual);  // TRIGGER BUG: ConstantOverflow
    }
}