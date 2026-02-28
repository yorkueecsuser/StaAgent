import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryBugTest {
    UnaryBug bug = new UnaryBug();

    @Test
    public void testShowBug() {
        int result = bug.showBug(5);  // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals(-5, result);
    }

    @Test
    public void testShowBugBoolean() {
        boolean result = bug.showBugBoolean(false);  // TRIGGER BUG: Unary prefix operators should not be repeated
        assertFalse(result);
    }
}