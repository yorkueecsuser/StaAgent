import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugExampleTest {

    @Test
    public void testShowBug() {
        SynchronizationBugExample example = new SynchronizationBugExample();
        
        Thread thread1 = new Thread(() -> {
            example.showBug(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        });

        Thread thread2 = new Thread(() -> {
            example.showBug(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            fail("Threads were interrupted unexpectedly");
        }
    }
}