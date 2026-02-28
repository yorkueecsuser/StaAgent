import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyScheduledThreadPoolExecutorTest {

    @Test
    public void showBug_shouldNotHaveZeroCoreThreads() {
        BuggyScheduledThreadPoolExecutor obj = new BuggyScheduledThreadPoolExecutor();
        obj.showBug(); // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        // The test will fail because the ScheduledThreadPoolExecutor is created with 0 core threads
    }
}