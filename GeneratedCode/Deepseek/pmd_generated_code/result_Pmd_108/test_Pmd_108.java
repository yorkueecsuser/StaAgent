import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientEmptyStringCheckTest {
    InefficientEmptyStringCheck check = new InefficientEmptyStringCheck();

    @Test // TRIGGER BUG: InefficientEmptyStringCheck
    public void testBar() {
        assertFalse(check.bar(" ")); // The bug triggers here
        assertTrue(check.bar("  ")); // This should pass
    }

    @Test // TRIGGER BUG: InefficientEmptyStringCheck
    public void testCheckTrimEmpty() {
        assertFalse(check.checkTrimEmpty(" ")); // The bug triggers here
        assertTrue(check.checkTrimEmpty("  ")); // This should pass
    }
}