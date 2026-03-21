import org.junit.Test;
import static org.junit.Assert.*;

public class LoopWithOneIterationBugTest {

    @Test
    public void testShowBug() {
        LoopWithOneIterationBug bug = new LoopWithOneIterationBug();
        int result = bug.showBug(2); // TRIGGER BUG: Loops with at most one iteration should be refactored
        assertNotEquals(2, result); // The loop in showBug method will always return the original value, not equal to 0, thus this test will fail.
    }
}