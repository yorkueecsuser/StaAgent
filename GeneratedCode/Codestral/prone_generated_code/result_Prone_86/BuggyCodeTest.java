import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();

        Class<?> lhs = String.class;
        Class<?> rhs = Integer.class;

        // TRIGGER BUG: IsInstanceOfClass
        assertFalse(buggyCode.showBug(lhs, rhs));
    }
}