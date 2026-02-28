import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadPoolBugExampleTest {

    @Test
    public void testShowBug() {
        ThreadPoolBugExample example = new ThreadPoolBugExample();
        example.showBug(); // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    }
}