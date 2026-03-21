import org.junit.Test;
import static org.junit.Assert.*;

public class AlternativeRegexBugTest {

    @Test
    public void testShowBug() {
        AlternativeRegexBug buggyCode = new AlternativeRegexBug();
        assertFalse(buggyCode.showBug("b"));  // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    }
}