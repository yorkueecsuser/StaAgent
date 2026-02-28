import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientEmptyStringCheckExampleTest {

    @Test
    public void testBarWithTrimLengthCheck() {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        assertFalse(example.showBug("   ")); // TRIGGER BUG: InefficientEmptyStringCheck
    }

    @Test
    public void testShowBugWithNonEmptyString() {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        assertTrue(example.showBug("abc")); // TRIGGER BUG: InefficientEmptyStringCheck
    }
}