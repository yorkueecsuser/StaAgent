import org.junit.Test;
import static org.junit.Assert.*;

public class RangeCheckerTest {

    @Test
    public void testDoRangeCheckWithNumberInRange() {
        RangeChecker checker = new RangeChecker();
        int result = checker.showBug(12); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(12, result); // This assertion will fail due to the bug
    }

    @Test
    public void testDoRangeCheckWithNumberBelowRange() {
        RangeChecker checker = new RangeChecker();
        int result = checker.showBug(-5); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(0, result); // This assertion will fail due to the bug
    }

    @Test
    public void testDoRangeCheckWithNumberAboveRange() {
        RangeChecker checker = new RangeChecker();
        int result = checker.showBug(25); // TRIGGER BUG: Min and max used in combination should not always return the same value
        assertEquals(20, result); // This assertion will fail due to the bug
    }
}