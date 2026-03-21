import org.junit.Test;
import static org.junit.Assert.*;

public class BadComparisonTest {

    private BadComparison badComparison = new BadComparison();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        int result = badComparison.showBug(5); // The bug is triggered here
        assertEquals("Expected result is 'This is a non-negative value.'", "This is a non-negative value.", result);
    }
}