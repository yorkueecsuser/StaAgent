import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MyThreadTest {

    @Test
    public void testNotifyInsteadOfNotifyAll() throws InterruptedException {
        MyThread myThread = new MyThread();
        List<String> results = myThread.showBug(5); // TRIGGER BUG: "notifyAll()" should be preferred over "notify()"
        assertEquals(5, results.size()); // This assertion will pass, but the bug is still present in the code logic
    }
}