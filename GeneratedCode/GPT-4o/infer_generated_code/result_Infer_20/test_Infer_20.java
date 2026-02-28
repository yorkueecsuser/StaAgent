import org.junit.Test;
import static org.junit.Assert.*;

public class ExpensiveLoopInvariantCallExampleTest {

    @Test
    public void testShowBug() {
        ExpensiveLoopInvariantCallExample example = new ExpensiveLoopInvariantCallExample();
        example.showBug(10); // TRIGGER BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        fail("This test should fail due to the expensive loop invariant call."); // TRIGGER BUG: EXPENSIVE_LOOP_INVARIANT_CALL
    }
}