import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadSleepBugTest {
    @Test
    public void testShowBug() throws InterruptedException {
        ThreadSleepBug bug = new ThreadSleepBug();
        bug.showBug();
        // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
        // Sleeping in the synchronized block might prevent other threads from acquiring the lock, leading to scalability and performance issues, and in the worst case, deadlocks.
    }
}