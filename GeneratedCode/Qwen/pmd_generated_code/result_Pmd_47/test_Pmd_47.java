import org.junit.Test;
import static org.junit.Assert.*;

public class IdempotentOperationsExampleTest {

    @Test
    public void testShowBug() {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5); // TRIGGER BUG: IdempotentOperations
        assertEquals(10, result); // This will cause the test to fail
    }
}