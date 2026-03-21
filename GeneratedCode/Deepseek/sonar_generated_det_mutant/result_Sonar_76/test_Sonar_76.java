import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main1 = new Main();
        Main main2 = new Main();

        Thread t1 = new Thread(() -> {
            synchronized (main1.fOpt) {
                main1.showBug();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (main2.fOpt) {
                main2.showBug(); // TRIGGER BUG: Value-based classes should not be used for locking
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            fail("InterruptedException occurred: " + e.getMessage());
        }
    }
}