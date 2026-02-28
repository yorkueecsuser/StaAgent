import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadPoolBugExampleTest {

    @Test
    public void testFutileMaxPoolSizeChange() {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        int maxSize = example.showBug(); // TRIGGER BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        assertEquals(5, maxSize); // This assertion will fail because the maximum pool size is set to 10, but the expected value is 5.
    }
}