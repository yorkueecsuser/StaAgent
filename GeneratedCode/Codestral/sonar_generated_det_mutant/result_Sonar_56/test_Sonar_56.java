import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugTest {

    @Test
    public void testShowBug() {
        StringComparisonBug bug = new StringComparisonBug("John", "John");
        boolean result = bug.showBug();
        assertFalse("Test case failed: Strings should not be compared using ==", result); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }
}