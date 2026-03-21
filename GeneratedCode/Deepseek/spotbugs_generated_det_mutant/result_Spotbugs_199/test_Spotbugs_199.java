import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityCheckVulnerabilityTest {
    private class MySecurityCheckVulnerability extends SecurityCheckVulnerability {
        @Override
        public String checkSecurity() {
            // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS)
            return "Insecure!";
        }
    }

    @Test
    public void testShowBug() {
        SecurityCheckVulnerability scv = new MySecurityCheckVulnerability();
        assertEquals("Insecure!", scv.showBug());
    }
}