import org.junit.Test;
import org.junit.Assert;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyClassTest {

    @Test
    public void testDoSomething() {
        MyClass myClass = new MyClass();
        myClass.showBug(); // TRIGGER BUG: Locks should be released on all paths
    }

    @Test(expected = IllegalMonitorStateException.class)
    public void testDoSomethingWithoutLock() {
        MyClass myClass = new MyClass();
        // Trigger the bug without locking
        myClass.doSomething();
    }
}