import org.junit.Test;
import static org.junit.Assert.*;
import javax.servlet.http.Cookie;

public class CookieBugTest {
    @Test
    public void testBugTrigger() {
        // TRIGGER BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        String cookieValue = "Cookie: example=test";
        Cookie cookie = new Cookie("example", cookieValue);
        cookie.setMaxAge(60 * 60);
        cookie.setPath("/");
        System.out.println(cookie.toString());
    }
}