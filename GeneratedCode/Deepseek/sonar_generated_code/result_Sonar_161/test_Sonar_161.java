import org.junit.Test;
import static org.junit.Assert.*;

public class LoopBugTest {

    @Test
    public void testShowBug() {
        LoopBug loopBug = new LoopBug();
        int result = loopBug.showBug();
        assertEquals(1, result); // Trigger BUG: Loops with at most one iteration should be refactored
    }
}