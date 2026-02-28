import org.junit.Test;
import static org.junit.Assert.*;

public class IdempotentOperationsBugTest {
    IdempotentOperationsBug bug = new IdempotentOperationsBug();

    @Test
    // TRIGGER BUG: IdempotentOperations
    public void testBug() {
        bug.showBug();
        assertTrue(false); // This assertion should fail to trigger the bug
    }
}