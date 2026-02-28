import org.junit.Test;
import static org.junit.Assert.*;

public class ExpensiveLoopInvariantCallExampleTest {

    @Test
    public void testExpensiveLoopInvariantCall() {
        ExpensiveLoopInvariantCallExample example = new ExpensiveLoopInvariantCallExample();
        assertEquals(10, example.showBug(10)); // TRIGGER BUG: EXPENSIVE_LOOP_INVARIANT_CALL​
    }
}