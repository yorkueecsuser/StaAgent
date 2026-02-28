import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteLoopBugTest {
    @Test
    public void testShowBug() {
        InfiniteLoopBug bug = new InfiniteLoopBug();
        int result = bug.showBug();
        // TRIGGER BUG: Loops should not be infinite
        assertEquals("Test Failed: Infinite loop did not break", Integer.MAX_VALUE, result);
    }
}