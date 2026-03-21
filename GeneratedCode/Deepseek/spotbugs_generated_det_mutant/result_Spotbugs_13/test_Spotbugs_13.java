import org.junit.Test;
import java.util.concurrent.*;
import static org.junit.Assert.*;

public class BuggedCodeTest {
    @Test
    public void testShowBug() {
        BuggedCode buggedCode = new BuggedCode();
        buggedCode.showBug(); // TRIGGER BUG: Dm: Futile attempt to change max pool size of ScheduledThreadPoolExecutor (DMI_FUTILE_ATTEMPT_TO_CHANGE_MAXPOOL_SIZE_OF_SCHEDULED_THREAD_POOL_EXECUTOR)
    }
}