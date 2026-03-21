import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void testShowBug() throws InterruptedException {
        Counter counter = new Counter();
        counter.showBug();

        // TRIGGER BUG: THREAD_SAFETY_VIOLATION
        int actualCount = counter.getCount();
        int expectedCount = 20000;
        assertEquals(expectedCount, actualCount);
    }
}