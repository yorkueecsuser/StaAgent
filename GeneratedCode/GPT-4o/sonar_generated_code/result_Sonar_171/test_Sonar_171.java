import org.junit.Test;
import static org.junit.Assert.*;

public class JumpStatementInFinallyBugTest {

    @Test
    public void testShowBug() {
        String result = JumpStatementInFinallyBug.showBug(); // TRIGGER BUG: Jump statements should not occur in "finally" blocks
        assertNull(result); // This will fail because the bug prevents the exception from being propagated
    }
}