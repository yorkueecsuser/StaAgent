import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticFieldBugTest {

    private StaticFieldBug sfb = new StaticFieldBug();

    @Test
    public void triggerBug() throws InterruptedException {
        int threadCount = 50;
        CountDownLatch latch = new CountDownLatch(threadCount);

        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                try {
                    sfb.showBug(); // TRIGGER BUG: Non-thread-safe fields should not be static
                } finally {
                    latch.countDown();
                }
            });
        }
        latch.await();
    }
}