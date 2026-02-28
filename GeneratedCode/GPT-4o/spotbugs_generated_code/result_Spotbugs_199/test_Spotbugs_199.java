import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityCheckExampleTest {

    @Test
    public void testShowBugAdminUser() {
        SecurityCheckExample example = new SecurityCheckExample();
        assertTrue(example.showBug("admin")); // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    }

    @Test
    public void testShowBugGuestUser() {
        SecurityCheckExample example = new SecurityCheckExample();
        assertFalse(example.showBug("guest")); // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    }

    @Test
    public void testShowBugOverride() {
        SecurityCheckExample example = new SecurityCheckExample() {
            @Override
            protected boolean checkAccess(String user) {
                return true; // Always grant access, bypassing the security check
            }
        };
        assertFalse(example.showBug("guest")); // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
    }
}