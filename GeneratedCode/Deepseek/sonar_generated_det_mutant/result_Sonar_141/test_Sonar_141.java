import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();

        try {
            main.showBug();
            fail("Expected an IllegalArgumentException to be thrown"); // Trigger line: 14
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Core pool size must be greater than 0")); // Trigger line: 14
        }
    }

    private class Main {
        public void showBug() {
            int poolSize = 5;

            // BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
            ScheduledThreadPoolExecutor threadPool1 = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);

            ScheduledThreadPoolExecutor threadPool2 = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(poolSize);
            threadPool2.setCorePoolSize(0);
        }
    }
}