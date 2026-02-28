import org.junit.Test;
import static org.junit.Assert.*;

public class TransactionalBugExampleTest {

    @Test
    public void testMethodACallsMethodB() {
        TransactionalBugExample example = new TransactionalBugExample();
        String result = example.showBug(); // TRIGGER BUG: Methods should not call same-class methods with incompatible "@Transactional" values
        assertEquals("Expected exception message", "No exception thrown", result);
    }
}