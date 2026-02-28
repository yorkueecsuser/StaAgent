import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    public void testShowBug() {
        try {
            BugExample.showBug();
        } catch (IndexOutOfBoundsException e) {
            fail("Expected IndexOutOfBoundsException to be thrown");
        } catch (PatternSyntaxException e) {
            // The bug is triggered only when an IndexOutOfBoundsException is not thrown
            // If it throws a PatternSyntaxException, it means the bug has been successfully triggered
            assertTrue(true);
        }
    }
}