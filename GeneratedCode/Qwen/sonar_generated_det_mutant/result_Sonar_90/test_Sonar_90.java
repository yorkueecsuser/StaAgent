import org.junit.Test;
import static org.junit.Assert.*;

public class DateFormatExampleTest {

    @Test
    public void testShowBugWithConcurrency() throws InterruptedException {
        final DateFormatExample example = new DateFormatExample();
        final String dateInput = "2023-10-05 14:30:00";

        Thread thread1 = new Thread(() -> {
            String result = example.showBug(dateInput); // TRIGGER BUG: Non-thread-safe fields should not be static
            assertEquals("2023-10-05 14:30:00", result);
        });

        Thread thread2 = new Thread(() -> {
            String result = example.showBug(dateInput); // TRIGGER BUG: Non-thread-safe fields should not be static
            assertEquals("2023-10-05 14:30:00", result);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}