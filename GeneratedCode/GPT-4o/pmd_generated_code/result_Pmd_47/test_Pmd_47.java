import org.junit.Test;
import static org.junit.Assert.*;

public class IdempotentOperationsExampleTest {

    @Test
    public void testShowBug() {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5); // TRIGGER BUG: IdempotentOperations
        assertNotEquals("The bug is triggered and the operation is idempotent, no effect should be expected.", 0, result);
    }
}