import org.junit.Test;
import static org.junit.Assert.*;

@SuppressWarnings("unchecked")
public class BugDemonstrationTest {

    @Test // TRIGGER BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
    public void testShowBug() {
        BugDemonstration.showBug();
        // This test should fail because the bug has been triggered
    }
}