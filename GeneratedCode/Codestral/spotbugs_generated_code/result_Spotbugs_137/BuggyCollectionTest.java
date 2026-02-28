import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCollectionTest {
    @Test
    public void testShowBug() {
        BuggyCollection buggyCollection = new BuggyCollection();
        assertFalse(buggyCollection.showBug("Example")); // TRIGGER BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
    }
}