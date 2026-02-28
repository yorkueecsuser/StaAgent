import org.junit.Test;
import static org.junit.Assert.*;

public class NonNegativeComparisonBugTest {

    @Test
    public void testShowBugWithNonNegativeValues() {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        int[] testValues = {1, 2, 3, 4, 5};
        assertFalse(bugDemo.showBug(testValues)); // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    }

    @Test
    public void testShowBugWithZeroValues() {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        int[] testValues = {0, 0, 0, 0, 0};
        assertFalse(bugDemo.showBug(testValues)); // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    }
}