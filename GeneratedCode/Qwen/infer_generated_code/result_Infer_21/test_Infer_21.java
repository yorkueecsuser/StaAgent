import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteExecutionTimeBugTest {

    @Test
    public void testShowBugWithNegativeInput() {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        int result = bugDemo.showBug(-1); // TRIGGER BUG: INFINITE_EXECUTION_TIME
        assertEquals(0, result);
    }

    @Test
    public void testShowBugWithZeroInput() {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        int result = bugDemo.showBug(0); // This should pass and not trigger the bug
        assertEquals(0, result);
    }

    @Test
    public void testShowBugWithPositiveInput() {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        int result = bugDemo.showBug(100); // This should pass and not trigger the bug
        assertEquals(10, result);
    }
}