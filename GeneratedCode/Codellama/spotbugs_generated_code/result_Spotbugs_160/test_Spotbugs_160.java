import org.junit.Test;
import static org.junit.Assert.*;

public class XSS_ExampleTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        XSS_Example.showBug("John <script>alert('XSS')</script>");
    }
}