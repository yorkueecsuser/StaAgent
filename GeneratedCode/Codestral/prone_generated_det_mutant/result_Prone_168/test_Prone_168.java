import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeInCodeBugTest {

    @Test
    public void testIsAuthenticated() {
        UnicodeInCodeBug bug = new UnicodeInCodeBug("password123");
        boolean result = bug.showBug("wrongPassword");

        // TRIGGER BUG: UnicodeInCode
        // The 'l' character in the 'equaⅼ' method name is a non-ASCII Unicode character,
        // which can be confusing and potentially unsafe. In this test case, it might not behave
        // as expected when called from the 'isAuthenticated' method.
        assertFalse(result);
    }
}