import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolBugTest {

    @Test
    public void testShowBug() {
        ScheduledThreadPoolBug bugDemo = new ScheduledThreadPoolBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        assertEquals("This test should fail because the scheduled task never runs.", "Task should have run.", result);
    }
}