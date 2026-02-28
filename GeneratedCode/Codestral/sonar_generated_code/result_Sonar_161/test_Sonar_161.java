import org.junit.Test;
import static org.junit.Assert.*;

public class LoopBugTest {

    @Test
    public void testShowBug() {
        LoopBug loopBug = new LoopBug();

        // TRIGGER BUG: Loops with at most one iteration should be refactored
        assertEquals(0, loopBug.showBug(2));
    }
}