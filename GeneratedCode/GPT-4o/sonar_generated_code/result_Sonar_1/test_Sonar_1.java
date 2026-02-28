import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StatusCodeBugExampleTest {

    @Test
    public void testShowBug() {
        File file = new File("example.txt");
        StatusCodeBugExample example = new StatusCodeBugExample(file);
        
        example.showBug(); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code

        // The test will fail if the file is not deleted and the lock is not acquired, triggering the bug
        assertFalse("File should not exist after deletion", file.exists());
        
        Lock testLock = new ReentrantLock();
        boolean lockAcquired = testLock.tryLock();
        assertTrue("Lock should be acquired", lockAcquired); // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }
}