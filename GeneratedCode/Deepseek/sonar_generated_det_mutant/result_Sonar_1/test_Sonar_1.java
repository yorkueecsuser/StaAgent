import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BugExampleTest {

    @Test
    public void showBugTest() {
        BugExample bugExample = new BugExample();
        File file = new File("example.txt");
        Lock lock = new ReentrantLock();
        bugExample.showBug(file, lock);  // TRIGGER BUG: Return values should not be ignored when they contain the operation status code
    }
}