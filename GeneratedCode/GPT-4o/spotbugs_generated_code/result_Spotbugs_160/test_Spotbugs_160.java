import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class XSSVulnerabilityServletTest {

    @Test
    public void testShowBugWithXSSInput() {
        XSSVulnerabilityServlet servlet = new XSSVulnerabilityServlet();
        XSSVulnerabilityServlet.HttpServletRequestSimulator request = new XSSVulnerabilityServlet.HttpServletRequestSimulator();
        XSSVulnerabilityServlet.HttpServletResponseSimulator response = new XSSVulnerabilityServlet.HttpServletResponseSimulator();
        
        try {
            servlet.showBug(request, response); // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        } catch (IOException e) {
            fail("IOException occurred: " + e.getMessage());
        }
        
        // Assertion to fail the test, indicating that XSS vulnerability can be triggered
        fail("XSS vulnerability triggered by direct user input to JSP writer."); // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
    }
}