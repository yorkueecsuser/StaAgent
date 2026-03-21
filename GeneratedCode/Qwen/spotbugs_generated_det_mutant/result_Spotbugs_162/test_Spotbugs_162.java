import org.junit.Test;
import static org.junit.Assert.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mockito.Mockito;

public class HttpResponseSplittingExampleTest {

    @Test
    public void testShowBugWithUntrustedInput() {
        // Create mock objects for HttpServletRequest and HttpServletResponse
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

        // Set up the mock request to return a value that could cause HTTP response splitting
        String maliciousInput = "maliciousValue\r\nSet-Cookie: anotherCookie=anotherValue";
        Mockito.when(request.getParameter("cookieValue")).thenReturn(maliciousInput);

        HttpResponseSplittingExample example = new HttpResponseSplittingExample();
        Cookie cookie = example.showBug(request, response); // TRIGGER BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)

        // Assert that the cookie value is set to the malicious input
        assertEquals(maliciousInput, cookie.getValue());
    }
}