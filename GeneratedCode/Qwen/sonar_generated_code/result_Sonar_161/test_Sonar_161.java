import org.junit.Test;
import static org.junit.Assert.*;

public class LoopWithOneIterationBugTest {

    @Test
    public void testShowBugWithConditionZero() {
        LoopWithOneIterationBug bugExample = new LoopWithOneIterationBug();
        assertEquals(0, bugExample.showBug(0)); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }

    @Test
    public void testShowBugWithConditionOne() {
        LoopWithOneIterationBug bugExample = new LoopWithOneIterationBug();
        assertEquals(0, bugExample.showBug(1)); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }

    @Test
    public void testShowBugWithConditionTwo() {
        LoopWithOneIterationBug bugExample = new LoopWithOneIterationBug();
        assertEquals(0, bugExample.showBug(2)); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }
}