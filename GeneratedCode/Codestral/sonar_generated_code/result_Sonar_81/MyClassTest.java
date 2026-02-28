import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class MyClassTest {
    @Test
    public void testDoSomethingSynchronized() throws InterruptedException {
        AtomicBoolean flag = new AtomicBoolean(false);
        MyClass obj = new ChildClass();
        Thread thread1 = new Thread(() -> {
            obj.doSomethingSynchronized();
            flag.set(true);
        });
        Thread thread2 = new Thread(() -> {
            obj.doSomethingSynchronized();
            assertTrue("Bug triggered: Both threads should not enter the synchronized block at the same time",!flag.get()); // TRIGGER BUG: "getClass" should not be used for synchronization
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}