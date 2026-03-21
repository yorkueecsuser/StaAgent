import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolExecutorBugTest {
    @Test
    public void testShowBug() throws InterruptedException {
        ScheduledThreadPoolExecutorBug bug = new ScheduledThreadPoolExecutorBug();
        // TRIGGER BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        assertFalse("The task should not have been executed", bug.showBug());
    }
}