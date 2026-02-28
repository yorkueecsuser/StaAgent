import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCompoundBugTest {

    @Test
    public void testIncrementCount() throws InterruptedException {
        VolatileCompoundBug bug = new VolatileCompoundBug();
        CountDownLatch latch = new CountDownLatch(1);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                bug.incrementCount();
            }
            latch.countDown();
        });

        Thread t2 = new Thread(() -> {
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10000; i++) {
                bug.incrementCount();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertTrue("Expected count: 20000, Actual count: " + bug.getCount(), bug.getCount()!= 20000);
    }

    @Test
    public void testToggleBoo() {
        VolatileCompoundBug bug = new VolatileCompoundBug();
        bug.toggleBoo();
        // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertFalse("Boo should not be toggled", bug.isBoo());
    }
}

class VolatileCompoundBug {
    private volatile AtomicInteger count = new AtomicInteger(0); // Compliant: using AtomicInteger to ensure thread safety
    private volatile boolean boo = false; // Noncompliant: volatile variable used with compound operator

    public void incrementCount() {
        count.getAndIncrement(); // Compliant: using getAndIncrement() method of AtomicInteger
    }

    public int getCount() {
        return count.get();
    }

    public void toggleBoo(){
        boo =!boo; // Noncompliant: volatile variable used with compound operator
    }

    public boolean isBoo() {
        return boo;
    }
}