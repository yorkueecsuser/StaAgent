import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugTest {

    @Test
    public void testShowBugWithSameLiteralStrings() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertTrue(bugDemo.showBug("John", "John")); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }

    @Test
    public void testShowBugWithDifferentLiteralStrings() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertFalse(bugDemo.showBug("John", "Doe")); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }

    @Test
    public void testShowBugWithSameValueDifferentObjects() {
        StringComparisonBug bugDemo = new StringComparisonBug();
        assertTrue(bugDemo.showBug("John", new String("John"))); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }
}