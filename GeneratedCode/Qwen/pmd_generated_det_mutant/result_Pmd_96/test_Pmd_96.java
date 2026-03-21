import org.junit.Test;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class UnsynchronizedStaticFormatterExampleTest {

    @Test
    public void testUnsynchronizedStaticFormatter() throws InterruptedException {
        final UnsynchronizedStaticFormatterExample example = new UnsynchronizedStaticFormatterExample();
        final ExecutorService executorService = Executors.newFixedThreadPool(10);
        final AtomicBoolean failed = new AtomicBoolean(false);

        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                try {
                    Date now = new Date();
                    String formattedDate = example.showBug(now); // TRIGGER BUG: UnsynchronizedStaticFormatter
                    System.out.println(formattedDate);
                } catch (Exception e) {
                    failed.set(true);
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        assertTrue(failed.get());
    }
}