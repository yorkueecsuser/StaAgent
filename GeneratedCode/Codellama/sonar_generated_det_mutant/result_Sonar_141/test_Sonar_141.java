import org.junit.Test;
import static org.junit.Assert.*;

public class ScheduledThreadPoolExecutorExampleTest {
    @Test
    public void testBug() {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(0);
        executor.setCorePoolSize(0);
        executor.execute(() -> System.out.println("Hello, world!"));
        // TRIGGER BUG: "ScheduledThreadPoolExecutor" should not have 0 core threads
    }
}