import org.junit.Test;
import static org.junit.Assert.*;

public class NonThreadSafeSingletonTest {
    // This test case fails because the singleton is not thread-safe.
    // Two threads can create their own instance of the singleton.
    @Test
    // TRIGGER BUG: NonThreadSafeSingleton
    public void testGetInstance() {
        // Create two threads that call getInstance() in parallel
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                NonThreadSafeSingleton singleton = NonThreadSafeSingleton.getInstance();
                System.out.println(System.identityHashCode(singleton));
            }
        });

        t1.start();
        t2.start();

        // Wait for the threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}