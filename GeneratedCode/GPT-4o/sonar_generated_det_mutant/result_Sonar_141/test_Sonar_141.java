import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolBugExampleTest {

    @Test
    public void testShowBug() {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        example.showBug(); // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    }
}