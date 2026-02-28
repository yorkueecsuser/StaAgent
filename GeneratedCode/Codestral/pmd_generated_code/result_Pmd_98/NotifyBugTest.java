import org.junit.Test;
import static org.junit.Assert.*;

public class NotifyBugTest {
    @Test
    public void testNotifyOneThread() {
        NotifyBug bug = new NotifyBug();
        bug.showBug(); // TRIGGER BUG: UseNotifyAllInsteadOfNotify
        // The bug is triggered when showBug() is called, as it notifies only one thread using notify() instead of notifyAll().
        // This can lead to unpredictable behavior when multiple threads are waiting, causing some threads to remain unnotified.
    }
}