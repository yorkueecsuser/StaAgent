import org.junit.Test;
import static org.junit.Assert.*;

public class LoopWithOneIterationBugTest {

    @Test
    public void testShowBugWithConditionZero() {
        LoopWithOneIterationBug bugDemo = new LoopWithOneIterationBug();
        assertEquals(0, bugDemo.showBug(0)); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }

    @Test
    public void testShowBugWithConditionOne() {
        LoopWithOneIterationBug bugDemo = new LoopWithOneIterationBug();
        assertEquals(0, bugDemo.showBug(1)); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }

    @Test
    public void testShowBugWithConditionTwo() {
        LoopWithOneIterationBug bugDemo = new LoopWithOneIterationBug();
        assertEquals(0, bugDemo.showBug(2)); // TRIGGER BUG: Loops with at most one iteration should be refactored
    }
}