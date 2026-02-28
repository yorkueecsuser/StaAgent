import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolExecutorWithZeroCoreThreadsTest {

    @Test
    public void testBug() {
        ScheduledThreadPoolExecutorWithZeroCoreThreads executor = new ScheduledThreadPoolExecutorWithZeroCoreThreads();
        executor.showBug(); // TRIGGER BUG: Dm: Creation of ScheduledThreadPoolExecutor with zero core threads (DMI_SCHEDULED_THREAD_POOL_EXECUTOR_WITH_ZERO_CORE_THREADS)
    }
}