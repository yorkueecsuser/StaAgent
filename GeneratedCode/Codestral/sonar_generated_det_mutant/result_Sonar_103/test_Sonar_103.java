import org.junit.Test;
import static org.junit.Assert.*;

public class BuggySynchronizationTest {
    @Test
    public void testShowBug() {
        BuggySynchronization buggySynchronization = new BuggySynchronization();
        Thread t1 = new Thread(() -> {
            assertEquals("green", buggySynchronization.showBug()); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        });
        Thread t2 = new Thread(() -> {
            assertEquals("green", buggySynchronization.showBug()); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        });
        t1.start();
        t2.start();
    }
}