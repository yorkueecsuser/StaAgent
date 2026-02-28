import org.junit.Test;
import static org.junit.Assert.*;

class UnnecessaryBooleanAssertionBug {
    @Test
    public void showBug() {
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
        assertFalse(false); // BUG: UnnecessaryBooleanAssertion
    }
}