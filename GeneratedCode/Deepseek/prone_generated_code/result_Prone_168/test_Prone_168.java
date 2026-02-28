import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeBugTest {
    private UnicodeBug ub = new UnicodeBug("password");

    @Test
    public void testIsAuthenticated() {
        // TRIGGER BUG: UnicodeInCode
        assertTrue(ub.showBug("password"));
    }
}