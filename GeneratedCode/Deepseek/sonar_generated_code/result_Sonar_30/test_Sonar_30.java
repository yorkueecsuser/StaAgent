import org.junit.Test;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        try {
            bugExample.showBug();
            fail("Expected an PatternSyntaxException to be thrown but it was not"); // If the bug is fixed, this line will execute and the test will fail
        } catch (PatternSyntaxException e) {
            assertEquals("Expected error message", "Illegal character range", e.getMessage());
        }
    }
}