import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MainTest {

    @Test // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    public void testShowBug() {
        Main main = new Main();
        main.showBug();

        // This test should fail because the bug is not triggered.
        // If it does not fail, the bug is not triggered.
        fail("The bug was not triggered.");
    }
}