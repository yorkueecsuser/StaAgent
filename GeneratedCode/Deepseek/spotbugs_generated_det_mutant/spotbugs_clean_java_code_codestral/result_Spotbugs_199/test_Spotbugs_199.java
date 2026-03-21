import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityCheckTest {

    @Test
    public void testCheckSecurity() {
        SecurityCheck check = new SecurityCheck() {
            // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
            @Override
            public boolean checkSecurity(String username) {
                // Overridden method to bypass security check
                return true;
            }
        };
        check.showBug("guest"); // This line should print "Access granted" but it does not due to the overridden checkSecurity method, which has no security check
    }
}