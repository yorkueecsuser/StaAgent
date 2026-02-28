import org.junit.Test;
import static org.junit.Assert.*;

public class IdentityBinaryExpressionBugTest {
    @Test
    public void testShowBug() {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true); // TRIGGER BUG: IdentityBinaryExpression
        assertEquals(true, result);
    }
}