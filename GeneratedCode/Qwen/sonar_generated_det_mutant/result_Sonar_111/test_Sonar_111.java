import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionBugTest {

    @Test
    public void testShowBug() {
        LoopConditionBug bugDemo = new LoopConditionBug();
        int result = bugDemo.showBug();  // TRIGGER BUG: Loop conditions should be true at least once
        assertEquals(0, result); // This assertion will pass, but the bug is triggered by the loop not executing
    }
}