import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeInCodeExampleTest {

    @Test
    public void testShowBugWithCorrectPassword() {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        boolean result = example.showBug("secretPassword");
        assertTrue("Expected true when password is correct", result); // TRIGGER BUG: UnicodeInCode
    }

    @Test
    public void testShowBugWithIncorrectPassword() {
        UnicodeInCodeExample example = new UnicodeInCodeExample();
        boolean result = example.showBug("wrongPassword123");
        assertFalse("Expected false when password is incorrect", result); // TRIGGER BUG: UnicodeInCode
    }
}