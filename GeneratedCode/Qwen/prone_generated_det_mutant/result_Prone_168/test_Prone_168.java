import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeBugExampleTest {

    @Test
    public void testIsAuthenticatedWithCorrectPassword() {
        UnicodeBugExample example = new UnicodeBugExample();
        assertFalse(example.showBug("secret")); // TRIGGER BUG: UnicodeInCode
    }

    @Test
    public void testIsAuthenticatedWithIncorrectPassword() {
        UnicodeBugExample example = new UnicodeBugExample();
        assertFalse(example.showBug("wrongpassword")); // TRIGGER BUG: UnicodeInCode
    }
}