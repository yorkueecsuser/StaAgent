import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BugExampleTest {
    @Test
    public void testDoSomething() throws IOException {
        // Create a test file
        File file = File.createTempFile("test", ".txt");
        Lock lock = new ReentrantLock();

        // Create an instance of BugExample
        BugExample bugExample = new BugExample();

        // Call the doSomething method
        String result = bugExample.doSomething(file, lock);

        // Verify that the result contains the expected output
        assertTrue(result.contains("Locked successfully"));
        assertTrue(result.contains("Deleted successfully"));

        // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
        assertFalse(result.contains("Lock failed"));
        assertFalse(result.contains("Delete failed"));
    }
}