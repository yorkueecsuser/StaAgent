import org.junit.Test;
import static org.junit.Assert.*;

public class NonNegativeComparisonBugTest {

    @Test
    public void showBugTest() {
        NonNegativeComparisonBug buggyClass = new NonNegativeComparisonBug();
        int nonNegativeValue = 5;  // a non-negative value
        int result = buggyClass.showBug(nonNegativeValue);
        assertEquals(-1, result);  // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    }
}