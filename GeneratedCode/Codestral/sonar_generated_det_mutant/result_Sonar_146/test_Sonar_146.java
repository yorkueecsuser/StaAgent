import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class BuggyCollectionTest {
    @Test
    public void testShowBug() {
        BuggyCollection buggyCollection = new BuggyCollection();
        List<Object> objs = buggyCollection.showBug();

        // TRIGGER BUG: Collections should not be passed as arguments to their own methods
        assertTrue(objs.containsAll(objs)); // Expected to fail, always returns true
        assertTrue(objs.removeAll(objs)); // Expected to fail, confusing. Should use clear() instead
        assertFalse(objs.retainAll(objs)); // Expected to fail, should be NOOP
    }
}