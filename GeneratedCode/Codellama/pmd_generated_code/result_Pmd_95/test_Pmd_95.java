import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeSingletonTest {
    @Test
    public void testNonThreadSafeSingleton() throws InterruptedException {
        NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
        singleton.incrementCounter();
        assertEquals(1, singleton.getCounter());

        Thread t1 = new Thread(() -> {
            NonThreadSafeSingleton.getInstance().incrementCounter();
        });

        Thread t2 = new Thread(() -> {
            NonThreadSafeSingleton.getInstance().incrementCounter();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertEquals(3, singleton.getCounter());
    }
}