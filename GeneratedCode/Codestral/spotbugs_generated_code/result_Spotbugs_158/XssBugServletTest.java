import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class XssBugServletTest {
    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        XssBugServlet servlet = new XssBugServlet();
        String userInput = "<script>alert('XSS')</script>"; // TRIGGER BUG: XSS: Servlet reflected cross site scripting vulnerability in error page (XSS_REQUEST_PARAMETER_TO_SEND_ERROR)
        servlet.showBug(userInput);
    }
}