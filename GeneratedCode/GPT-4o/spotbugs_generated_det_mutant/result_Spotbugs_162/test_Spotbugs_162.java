import org.junit.Test;
import static org.junit.Assert.*;

// Dummy classes to replace unavailable imports
class HttpServletRequest {
    public String getParameter(String name) {
        return "untrustedValue";
    }
}

class HttpServletResponse {
    public void addCookie(Cookie cookie) {
        // Dummy implementation
    }
}

class Cookie {
    public Cookie(String name, String value) {
        // Dummy implementation
    }
}

class HttpResponseSplittingExample {

    public void showBug(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String untrustedParam = request.getParameter("userInput"); // This is untrusted input from the user
        addCookie(response, untrustedParam);
    }

    private void addCookie(HttpServletResponse response, String untrustedValue) {
        Cookie cookie = new Cookie("session", untrustedValue); // BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        response.addCookie(cookie);
    }
}

public class HttpResponseSplittingExampleTest {

    @Test
    public void testShowBugTriggersHttpResponseSplitting() {
        HttpServletRequest request = new HttpServletRequest();
        HttpServletResponse response = new HttpServletResponse();
        HttpResponseSplittingExample example = new HttpResponseSplittingExample();
        
        try {
            example.showBug(request, response); // TRIGGER BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        } catch (IOException e) {
            fail("IOException should not have been thrown.");
        }

        // Since the test is supposed to trigger the bug, we expect it to fail.
        fail("Test should trigger an HTTP response splitting vulnerability due to untrusted input in cookie.");
    }
}