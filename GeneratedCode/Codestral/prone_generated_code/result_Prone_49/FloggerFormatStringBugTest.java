import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerFormatStringBugTest {
    @Test
    public void testShowBugWithNullArgument() {
        FloggerFormatStringBug bug = new FloggerFormatStringBug();
        String result = bug.showBug(null); // TRIGGER BUG: FloggerFormatString
        assertNotNull("Expected the result to be a string, but it was null.", result);
    }
}