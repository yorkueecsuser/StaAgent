import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyThreadTest {
    @Test
    public void testShowBug() {
        String threadName = Thread.currentThread().getName();
        BuggyThread.showBug(); // TRIGGER BUG: "Thread.run()" should not be called directly
        assertNotEquals("Main thread should not be the current thread", threadName, Thread.currentThread().getName());
    }
}