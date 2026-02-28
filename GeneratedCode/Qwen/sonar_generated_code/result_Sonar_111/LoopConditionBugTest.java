import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionBugTest {

    @Test
    public void testShowBugFailsWhenLoopNeverExecutes() {
        LoopConditionBug bugDemo = new LoopConditionBug();
        int result = bugDemo.showBug();  // TRIGGER BUG: Loop conditions should be true at least once
        assertEquals(1, result); // This assertion will fail because the loop never executes and sum remains 0
    }
}