import org.junit.Test;
import static org.junit.Assert.*;

public class IdempotentOperationBugTest {
    @Test
    public void testIdempotentOperationBug() {
        IdempotentOperationBug buggyClass = new IdempotentOperationBug();
        int x = 10;
        buggyClass.setX(x);
        int result = buggyClass.showBug(x); // TRIGGER BUG: IdempotentOperations
        assertEquals(x, result);
        x = 20;
        buggyClass.setX(x);
        result = buggyClass.showBug(x); // TRIGGER BUG: IdempotentOperations
        assertEquals(x, result);
    }
}