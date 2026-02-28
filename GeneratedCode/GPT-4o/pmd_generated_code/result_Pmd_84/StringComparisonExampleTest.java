import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonExampleTest {

    @Test
    public void testShowBugWithLiteralString() {
        StringComparisonExample example = new StringComparisonExample();
        boolean result = example.showBug("example"); // TRIGGER BUG: UseEqualsToCompareStrings
        assertFalse("Expected false because '==' is unreliable for string comparison", result);
    }

    @Test
    public void testShowBugWithNewString() {
        StringComparisonExample example = new StringComparisonExample();
        boolean result = example.showBug(new String("example")); // TRIGGER BUG: UseEqualsToCompareStrings
        assertFalse("Expected false because '==' is unreliable for string comparison", result);
    }
}