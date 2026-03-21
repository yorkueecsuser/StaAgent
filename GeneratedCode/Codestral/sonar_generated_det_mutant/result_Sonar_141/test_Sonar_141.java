import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolExecutorBugTest {

    @Test
    public void testScheduledThreadPoolExecutorBug() {
        ScheduledThreadPoolExecutorBug bugDemo = new ScheduledThreadPoolExecutorBug();
        bugDemo.showBug();

        // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        assertEquals("ScheduledThreadPoolExecutor should not have 0 core threads", 5, bugDemo.threadPool1.getCorePoolSize());
        assertEquals("ScheduledThreadPoolExecutor should not have 0 core threads", 0, bugDemo.threadPool2.getCorePoolSize());
    }
}