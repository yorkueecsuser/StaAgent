import org.junit.Test;
import static org.junit.Assert.*;

public class IntComparisonBugTest {
    @Test
    public void testShowBug() {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        assertFalse(result);
    }
}