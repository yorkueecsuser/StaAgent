import java.net.HttpCookie;
import org.junit.Test;
import static org.junit.Assert.*;

public class CookieBugTest {
    @Test
    public void testShowBug() {
        CookieBug bugObject = new CookieBug();
        String untrustedInput = "UnsafeInput\r\nSet-Cookie: maliciousCookie=maliciousValue";
        HttpCookie cookie = bugObject.showBug(untrustedInput);
        assertNotNull(cookie);
        // TRIGGER BUG: HRS: HTTP cookie formed from untrusted input (HRS_REQUEST_PARAMETER_TO_COOKIE)
        assertNotEquals(untrustedInput, cookie.getValue());
    }
}