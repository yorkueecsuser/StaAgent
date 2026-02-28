import org.junit.Test;
import static org.junit.Assert.*;

public class InefficientEmptyStringCheckExampleTest {

    @Test
    public void testShowBugWithEmptyString() {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        boolean result = example.showBug("   "); // TRIGGER BUG: InefficientEmptyStringCheck
        assertFalse("Expected false for input string with only whitespaces", result);
    }

    @Test
    public void testShowBugWithNonEmptyString() {
        InefficientEmptyStringCheckExample example = new InefficientEmptyStringCheckExample();
        boolean result = example.showBug("text"); // TRIGGER BUG: InefficientEmptyStringCheck
        assertTrue("Expected true for input string with non-whitespace characters", result);
    }
}