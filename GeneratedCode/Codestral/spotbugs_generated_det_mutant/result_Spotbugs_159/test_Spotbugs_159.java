import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class XSSVulnerableServletTest {
    @Test(expected = IOException.class)
    public void testXSSVulnerability() throws IOException {
        XSSVulnerableServlet servlet = new XSSVulnerableServlet();
        // TRIGGER BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
        servlet.showBug("<script>alert('XSS')</script>", new Object());
    }
}