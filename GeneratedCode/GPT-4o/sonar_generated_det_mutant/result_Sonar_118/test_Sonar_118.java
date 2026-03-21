import org.junit.Test;
import static org.junit.Assert.*;

public class LockExampleTest {

    @Test
    public void testShowBugWhenNotInitialized() {
        LockExample example = new LockExample();
        example.showBug(); // TRIGGER BUG: Locks should be released on all paths
        assertFalse("Lock should be released even when not initialized.", example.isInitialized());
    }

    @Test
    public void testShowBugWhenInitialized() {
        LockExample example = new LockExample();
        example.setInitialized(true);
        example.showBug(); // TRIGGER BUG: Locks should be released on all paths
        assertTrue("Lock should be released when initialized.", example.isInitialized());
    }
}