import org.junit.Test;
import static org.junit.Assert.*;

public class IdenticalExpressionsBugTest {
    @Test
    public void testShowBug() {
        IdenticalExpressionsBug bug = new IdenticalExpressionsBug();
        int a = 5, b = 10;

        // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
        assertTrue(bug.showBug(a, b)); // Always true, this should fail

        // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
        assertFalse(bug.showBug(b, a)); // Always false, this should fail

        // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
        assertTrue(bug.showBug(a, a)); // If a == b, this should fail
    }
}