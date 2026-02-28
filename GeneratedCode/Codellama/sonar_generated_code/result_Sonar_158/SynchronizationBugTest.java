import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {

    @Test
    public void testSyncMethod() {
        SynchronizationBug bug = new SynchronizationBug();
        bug.syncMethod(1);
    }

    @Test
    public void testShowBug() {
        SynchronizationBug bug = new SynchronizationBug();
        assertEquals(null, bug.showBug(1));
    }
}