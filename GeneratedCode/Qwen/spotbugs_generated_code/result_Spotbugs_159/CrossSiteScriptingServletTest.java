import org.junit.Test;
import static org.junit.Assert.*;

public class CrossSiteScriptingServletTest {

    @Test
    public void testShowBugWithMaliciousInput() throws Exception {
        CrossSiteScriptingServlet servlet = new CrossSiteScriptingServlet();
        String maliciousInput = "<script>alert('XSS')</script>";
        String result = servlet.showBug(maliciousInput); // TRIGGER BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        assertEquals("User Input: <script>alert('XSS')</script>", result);
    }
}