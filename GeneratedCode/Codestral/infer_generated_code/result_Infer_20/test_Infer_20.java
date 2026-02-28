import org.junit.Test;
import static org.junit.Assert.*;

public class ExpensiveLoopInvariantCallTest {

    @Test
    public void testExpensiveLoopInvariantCallBug() {
        int size = 10;
        ExpensiveLoopInvariantCall.showBug(size); // TRIGGER BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        assertEquals(size + 1, ExpensiveLoopInvariantCall.incr(size)); // This assertion should fail because incr is called in a loop which is expensive and loop-invariant
    }
}