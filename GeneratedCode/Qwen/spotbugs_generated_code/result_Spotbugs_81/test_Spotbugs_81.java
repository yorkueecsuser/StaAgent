import org.junit.Test;
import static org.junit.Assert.*;

public class NonNegativeComparisonBugTest {

    @Test
    public void testShowBugWithPositiveValue() {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        assertFalse(bugDemo.showBug(5)); // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    }

    @Test
    public void testShowBugWithZeroValue() {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        assertFalse(bugDemo.showBug(0)); // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    }
}