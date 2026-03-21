import org.junit.Test;
import static org.junit.Assert.*;

public class XSSVulnerabilityTest {
    XSSVulnerability xss = new XSSVulnerability();

    @Test
    public void testShowBug() {
        String userInput = "<script>alert('XSS')</script>";
        String result = xss.showBug(userInput); // TRIGGER BUG: XSS: JSP reflected cross site scripting vulnerability (XSS_REQUEST_PARAMETER_TO_JSP_WRITER)
        assertNotEquals(result, "<html><body>Your input: " + userInput + "</body></html>");
    }
}