import org.junit.Test;
import static org.junit.Assert.*;

public class NaNEqualityCheckTest {

    @Test
    public void testShowBugWithNaN() {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;
        boolean result = checker.showBug(value); // TRIGGER BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        assertTrue("The method showBug should return true for NaN value, but it didn't.", result);
    }

    @Test
    public void testShowBugWithNormalValue() {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = 1.0;
        boolean result = checker.showBug(value);
        assertFalse("The method showBug should return false for normal value, but it didn't.", result);
    }
}