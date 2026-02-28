import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AvoidUsingVolatileTest {

    @Test
    public void testShowBug() {
        AvoidUsingVolatile av = new AvoidUsingVolatile();
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        av.showBug(); // TRIGGER BUG: AvoidUsingVolatile
                    }
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < 1000; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                // Do nothing
            }
        }
        // assert that counter is not equal to 1000000
        assertNotEquals(1000000, av.showBug()); // TRIGGER BUG: AvoidUsingVolatile
    }
}