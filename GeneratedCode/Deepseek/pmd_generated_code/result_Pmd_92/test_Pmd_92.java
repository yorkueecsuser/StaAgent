import org.junit.Test;
import static org.junit.Assert.*;

public class DoNotUseThreadsTest {
    DoNotUseThreads doNotUseThreads = new DoNotUseThreads();

    @Test
    public void testShowBug() {
        // Expected: DoNotUseThreads
        // This test case fails to trigger the bug because the showBug method creates a new Thread but it is not started.
        doNotUseThreads.showBug(); // TRIGGER BUG: DoNotUseThreads
    }
}