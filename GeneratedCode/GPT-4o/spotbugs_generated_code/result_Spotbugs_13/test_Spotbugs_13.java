import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolExecutorBugExampleTest {

    @Test
    public void testShowBug() {
        ScheduledThreadPoolExecutorBugExample example = new ScheduledThreadPoolExecutorBugExample();
        example.showBug(); // TRIGGER BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        fail("Expected bug: changing max pool size of ScheduledThreadPoolExecutor is futile and should be reflected in behavior.");
    }
}