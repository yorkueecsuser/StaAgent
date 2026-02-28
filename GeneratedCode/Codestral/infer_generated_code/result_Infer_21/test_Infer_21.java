import org.junit.Test;
import static org.junit.Assert.*;

public class InfiniteExecutionTimeBugTest {
    @Test
    public void testInfiniteExecutionTimeBug() {
        String input = new String(new char[10000]); // Creating a very large string to trigger infinite execution time
        InfiniteExecutionTimeBug.showBug(input); // TRIGGER BUG: INFINITE_EXECUTION_TIME​
    }
}