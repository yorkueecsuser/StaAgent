import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityCheckTest {
    @Test
    public void testIsUserAuthorized() {
        SecurityCheck securityCheck = new SecurityCheck();
        assertFalse(securityCheck.isUserAuthorized("user", "pass"));
        // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
        securityCheck.showBug("user", "pass");
        assertFalse(securityCheck.isUserAuthorized("user", "pass"));
    }
}