import org.junit.Test;
import static org.junit.Assert.*;

public class FutileMaxPoolSizeChangeTest {
    @Test
    public void testShowBug() {
        FutileMaxPoolSizeChange futileMaxPoolSizeChange = new FutileMaxPoolSizeChange();
        int initialCorePoolSize = 5;
        int newMaxPoolSize = 10;

        // TRIGGER BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
        int result = futileMaxPoolSizeChange.showBug(initialCorePoolSize, newMaxPoolSize);

        // Assert that the maximum pool size has not changed
        assertEquals(initialCorePoolSize, result);
    }
}