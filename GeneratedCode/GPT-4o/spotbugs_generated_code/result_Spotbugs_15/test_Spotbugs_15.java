import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledExecutorBugExampleTest {

    @Test
    public void testShowBug() {
        ScheduledExecutorBugExample example = new ScheduledExecutorBugExample();
        example.showBug(); // TRIGGER BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
        fail("The task was not executed because the executor was created with zero core threads.");
    }
}