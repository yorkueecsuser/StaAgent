import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonBugTest {

    @Test
    public void testShowBug() {
        StringComparisonBug buggyCode = new StringComparisonBug("John", "John");
        // TRIGGER BUG: Strings should be compared using "equals()"
        assertFalse(buggyCode.showBug());
    }
}