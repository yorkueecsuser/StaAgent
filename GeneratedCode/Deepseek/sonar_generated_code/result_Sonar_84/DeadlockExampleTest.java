import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {

    DeadlockExample deadlockExample = new DeadlockExample();

    @Test
    public void testShowBug() throws InterruptedException {
        Thread t1 = new Thread(() -> deadlockExample.showBug());
        Thread t2 = new Thread(() -> deadlockExample.showBug());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // TRIGGER BUG: "wait" should not be called when multiple locks are held
    }
}