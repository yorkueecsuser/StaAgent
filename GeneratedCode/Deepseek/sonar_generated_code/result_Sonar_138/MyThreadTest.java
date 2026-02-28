import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {
    @Test // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    public void testMyThread() {
        MyThread thread = new MyThread();
        thread.start(); // Trigger the bug as the thread will not do anything without a run method
    }
}