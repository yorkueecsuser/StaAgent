import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolExecutorBugTest {

    @Test
    public void testShowBug() {
        ScheduledThreadPoolExecutorBug demo = new ScheduledThreadPoolExecutorBug();
        demo.showBug(); // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    }
}