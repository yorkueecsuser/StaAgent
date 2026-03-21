import org.junit.Test;
import static org.junit.Assert.*;

public class UnaryOperatorBugTest {
    @Test
    public void testShowBug() {
        UnaryOperatorBug bug = new UnaryOperatorBug();
        int result = bug.showBug(5);
        // TRIGGER BUG: Unary prefix operators should not be repeated
        assertEquals("Bug triggered: unexpected result", -5, result);
    }
}