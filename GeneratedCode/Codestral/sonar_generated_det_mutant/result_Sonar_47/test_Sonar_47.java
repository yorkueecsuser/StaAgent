import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyRegexTest {

    @Test
    public void testBugTrigger() {
        BuggyRegex buggyRegex = new BuggyRegex();
        assertNotEquals("", buggyRegex.showBug("")); // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
    }
}