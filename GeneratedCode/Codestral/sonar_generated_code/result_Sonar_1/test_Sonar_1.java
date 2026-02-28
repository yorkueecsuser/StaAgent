import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        File file = new File("test.txt");
        assertFalse(file.exists()); // Ensure the file doesn't exist initially

        Lock lock = new ReentrantLock();
        assertTrue(lock.tryLock()); // Ensure the lock is available initially
        lock.unlock(); // Unlock the lock

        BuggyCode.showBug(file, lock);
        // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
        // The assertions below will fail if the return values of file.delete() and lock.tryLock() are ignored

        assertFalse(file.exists()); // If file.delete() is ignored, this assertion will fail
        assertFalse(lock.tryLock()); // If lock.tryLock() is ignored, this assertion will fail
    }
}