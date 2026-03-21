import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadSafetyExampleTest {
    private ThreadSafetyExample example = new ThreadSafetyExample();

    @Test
    // TRIGGER BUG: THREAD_SAFETY_VIOLATION
    // This test case triggers the bug by calling showBug method
    public void testShowBug() {
        int result = example.showBug();
        // We expect the result to be less than or equal to 2 because there are two threads
        // incrementing the counter. If the counter is not thread-safe, it may be greater than 2.
        assertTrue("The result should be less than or equal to 2", result <= 2);
    }
}