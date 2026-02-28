import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadPoolBugDemoTest {

    @Test
    public void testShowBug1() {
        ThreadPoolBugDemo demo = new ThreadPoolBugDemo();
        demo.showBug1(); // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        // The test will fail because the core pool size is zero and no tasks will execute
    }

    @Test
    public void testShowBug2() {
        ThreadPoolBugDemo demo = new ThreadPoolBugDemo();
        demo.showBug2(); // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
        // The test will fail because the core pool size is set to zero, resulting in no tasks being executed
    }
}