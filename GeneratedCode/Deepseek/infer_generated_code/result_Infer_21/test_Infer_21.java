import org.junit.*;
import static org.junit.Assert.*;

public class InfiniteExecutionTimeBugTest {
    InfiniteExecutionTimeBug bug = new InfiniteExecutionTimeBug();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: INFINITE_EXECUTION_TIME​
        bug.showBug();
    }
}