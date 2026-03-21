import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BugDemonstrationTest {

    @Test
    public void testShowBugWithFileDeletionFailure() {
        BugDemonstration demo = new BugDemonstration();
        File nonExistentFile = new File("nonexistentfile.txt"); // Ensure the file does not exist
        Lock lock = new ReentrantLock();
        demo.showBug(nonExistentFile, lock); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }

    @Test
    public void testShowBugWithLockTryLockFailure() {
        BugDemonstration demo = new BugDemonstration();
        File tempFile = new File("temp.txt");
        try {
            tempFile.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Lock lock = new ReentrantLock();
        lock.lock(); // Acquire the lock to ensure tryLock fails
        demo.showBug(tempFile, lock); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }
}