import org.junit.Test;
import static org.junit.Assert.*;

public class ByteComparisonBugTest {

    @Test
    public void testShowBugWithPositiveValue() {
        ByteComparisonBug bugDemo = new ByteComparisonBug();
        assertFalse(bugDemo.showBug((byte) 100)); // Expected: false
    }

    @Test
    public void testShowBugWithLargeValue() {
        ByteComparisonBug bugDemo = new ByteComparisonBug();
        assertFalse(bugDemo.showBug((byte) 200)); // Expected: false (but incorrectly true due to bug) // TRIGGER BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }
}