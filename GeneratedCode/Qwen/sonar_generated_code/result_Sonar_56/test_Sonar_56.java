import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugTest {

    @Test
    public void testShowBugWithSameStrings() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertTrue(bugDemo.showBug("John", "John")); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }

    @Test
    public void testShowBugWithDifferentStrings() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertFalse(bugDemo.showBug("John", "Doe")); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }
}