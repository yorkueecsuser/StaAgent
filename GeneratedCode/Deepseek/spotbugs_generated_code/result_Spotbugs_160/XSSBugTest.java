import org.junit.Test;
import static org.junit.Assert.*;

public class XSSBugTest {
    @Test
    public void testXSSBug() throws Exception {
        XSSBug bug = new XSSBug();
        String input = "<script>alert('XSS')</script>";
        String output = bug.showBug(input);

        // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        assertFalse(output.contains(input));
    }
}