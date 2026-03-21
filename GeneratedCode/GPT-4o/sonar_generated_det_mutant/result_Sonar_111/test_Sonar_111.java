import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionBugDemoTest {

    @Test
    public void testShowBug() {
        LoopConditionBugDemo demo = new LoopConditionBugDemo();
        int result = demo.showBug(); // TRIGGER BUG: Loop conditions should be true at least once
        assertEquals("The sum should be calculated correctly.", 0, result + 1); // TRIGGER BUG: Loop conditions should be true at least once
    }
}