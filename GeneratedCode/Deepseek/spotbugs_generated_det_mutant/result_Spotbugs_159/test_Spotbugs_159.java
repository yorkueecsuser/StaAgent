import org.junit.Test;
import static org.junit.Assert.*;

public class XSSServletTest {
    @Test
    public void testShowBug() throws Exception {
        XSSServlet xssServlet = new XSSServlet();
        xssServlet.showBug("name=<script>alert('XSS')</script>"); // TRIGGER BUG: XSS: Servlet reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_SERVLET_WRITER)
    }
}