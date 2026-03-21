import org.junit.Test;
import static org.junit.Assert.*;

public class StringTrimBugTest {

    @Test(expected = Exception.class)
    public void testShowBugWithLeadingSpaces() throws Exception {
        StringTrimBug bugDemo = new StringTrimBug();
        String result = bugDemo.showBug("http://example.com"); // TRIGGER BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED) 
        assertFalse(result.startsWith(" ") || result.endsWith(" "));
    }

    @Test(expected = Exception.class)
    public void testShowBugWithTrailingSpaces() throws Exception {
        StringTrimBug bugDemo = new StringTrimBug();
        String result = bugDemo.showBug("http://example.com"); // TRIGGER BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED) 
        assertFalse(result.startsWith(" ") || result.endsWith(" "));
    }
}