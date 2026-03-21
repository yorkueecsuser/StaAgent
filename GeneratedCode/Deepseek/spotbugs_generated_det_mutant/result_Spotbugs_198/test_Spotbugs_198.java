import org.junit.Test;
import static org.junit.Assert.*;

public class UnsafeBugTest {
    @Test
    // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    public void testShowBug() {
        UnsafeBug unsafeBug = new UnsafeBug("sensitive");
        assertTrue(unsafeBug.showBug("sensitive").equals("sensitive")); // Expected to return "sensitive"
        assertTrue(unsafeBug.showBug("untrusted").equals("Access Denied")); // Expected to return "Access Denied"
        assertTrue(unsafeBug.showBug("sensitive").equals("Access Denied")); // Expected to return "Access Denied", but returns "sensitive" due to bug
    }
}