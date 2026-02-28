import org.junit.Test;
import static org.junit.Assert.*;

public class RegexEmptyStringBugTest {

    @Test
    public void testShowBug() {
        RegexEmptyStringBug bugInstance = new RegexEmptyStringBug();
        // TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string
        assertFalse(bugInstance.showBug(""));
    }
}