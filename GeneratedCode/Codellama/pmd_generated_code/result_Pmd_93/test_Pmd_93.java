import org.junit.Test;
import static org.junit.Assert.*;

public class DontCallThreadRunTest {
    @Test
    public void testRun() {
        DontCallThreadRun dctt = new DontCallThreadRun();
        dctt.showBug(); // TRIGGER BUG: DontCallThreadRun
    }

    public void showBug() {
        AtomicInteger count = new AtomicInteger(0);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                count.incrementAndGet();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start(); // BUG: DontCallThreadRun
    }
}