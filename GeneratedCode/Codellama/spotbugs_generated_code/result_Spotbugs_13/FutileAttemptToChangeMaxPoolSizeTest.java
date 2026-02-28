import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import static org.junit.Assert.*;

public class FutileAttemptToChangeMaxPoolSizeTest {
    @Test
    public void testFutileAttempt() throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        executor.setMaximumPoolSize(10); // TRIGGER BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        System.out.println("The maximum pool size is: " + executor.getMaximumPoolSize());
        assertEquals(10, executor.getMaximumPoolSize());
    }
}