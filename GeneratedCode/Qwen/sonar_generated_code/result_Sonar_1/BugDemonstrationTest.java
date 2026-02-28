import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BugDemonstrationTest {

    @Test
    public void testShowBugWithFileDeletionFailure() {
        BugDemonstration demo = new BugDemonstration();
        File tempFile = new File("temp.txt");
        Lock lock = new ReentrantLock();
        tempFile.delete(); // Ensure file does not exist before test
        assertFalse(demo.showBug(tempFile, lock)); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }

    @Test
    public void testShowBugWithLockTryLockFailure() {
        BugDemonstration demo = new BugDemonstration();
        File tempFile = new File("temp.txt");
        Lock lock = new ReentrantLock();
        lock.lock(); // Acquire lock to ensure tryLock fails
        assertFalse(demo.showBug(tempFile, lock)); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }
}