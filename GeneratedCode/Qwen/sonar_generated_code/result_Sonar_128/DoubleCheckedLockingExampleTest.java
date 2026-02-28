import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCheckedLockingExampleTest {

    @Test
    public void testGetInstanceRaceCondition() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            DoubleCheckedLockingExample.getInstance().showBug(); // TRIGGER BUG: Double-checked locking should not be used
        });

        Thread t2 = new Thread(() -> {
            DoubleCheckedLockingExample.getInstance().showBug(); // TRIGGER BUG: Double-checked locking should not be used
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}