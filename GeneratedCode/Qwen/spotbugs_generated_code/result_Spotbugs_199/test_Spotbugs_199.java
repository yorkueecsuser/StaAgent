import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityCheckExampleTest {

    @Test
    public void testPerformSecurityCheck() {
        SecurityCheckExample example = new SecurityCheckExample();
        example.showBug(); // TRIGGER BUG: VSC: Non-Private and non-final security check methods are vulnerable (VSC_VULNERABLE_SECURITY_CHECK_METHODS) ⁠
    }
}