import org.junit.Test;
import static org.junit.Assert.*;

public class RangeCheckerTest {

    @Test
    public void testRangeWithinBounds() {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(10); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals("Expected 10 within the bounds of 0 and 20", 10, result);
    }

    @Test
    public void testRangeUpperBound() {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(20); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals("Expected 20 at the upper bound", 20, result);
    }

    @Test
    public void testRangeLowerBound() {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(0); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals("Expected 0 at the lower bound", 0, result);
    }

    @Test
    public void testRangeBelowLowerBound() {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(-5); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals("Expected 0 as the result for input below the lower bound", 0, result);
    }

    @Test
    public void testRangeAboveUpperBound() {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(25); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals("Expected 20 as the result for input above the upper bound", 20, result);
    }
}