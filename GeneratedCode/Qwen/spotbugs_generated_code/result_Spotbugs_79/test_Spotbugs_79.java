import org.junit.Test;
import static org.junit.Assert.*;

public class IntComparisonBugTest {

    @Test
    public void testShowBugWithMaxInt() {
        IntComparisonBug bugDemo = new IntComparisonBug();
        assertFalse(bugDemo.showBug(Integer.MAX_VALUE)); // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
    }

    @Test
    public void testShowBugWithZero() {
        IntComparisonBug bugDemo = new IntComparisonBug();
        assertFalse(bugDemo.showBug(0)); // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
    }

    @Test
    public void testShowBugWithNegativeValue() {
        IntComparisonBug bugDemo = new IntComparisonBug();
        assertFalse(bugDemo.showBug(-1)); // TRIGGER BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
    }
}