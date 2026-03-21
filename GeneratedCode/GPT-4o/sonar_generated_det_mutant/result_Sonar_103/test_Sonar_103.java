import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugExampleTest {

    @Test
    public void testShowBug() {
        SynchronizationBugExample example = new SynchronizationBugExample();
        example.showBug(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
    }

    @Test
    public void testConcurrentShowBug() throws InterruptedException {
        SynchronizationBugExample example = new SynchronizationBugExample();

        Thread thread1 = new Thread(() -> example.showBug());
        Thread thread2 = new Thread(() -> example.showBug());

        thread1.start(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields
        thread2.start(); // TRIGGER BUG: Blocks should be synchronized on "private final" fields

        thread1.join();
        thread2.join();
    }
}