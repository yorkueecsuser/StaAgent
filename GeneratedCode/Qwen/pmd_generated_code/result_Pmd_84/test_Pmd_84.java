import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugTest {

    @Test
    public void testShowBugWithLiteral() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertFalse(bugDemo.showBug("one")); // TRIGGER BUG: UseEqualsToCompareStrings
    }

    @Test
    public void testShowBugWithNewString() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertFalse(bugDemo.showBug(new String("one"))); // TRIGGER BUG: UseEqualsToCompareStrings
    }
}