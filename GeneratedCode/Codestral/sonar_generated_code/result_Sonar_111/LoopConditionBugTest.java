import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionBugTest {
    @Test
    public void testShowBug() {
        LoopConditionBug bug = new LoopConditionBug();
        try {
            bug.showBug();  // TRIGGER BUG: Loop conditions should be true at least once
            fail("Expected an error, but got none");
        } catch (Exception e) {
            // This block is intentionally left empty
        }
    }
}