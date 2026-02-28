import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCollectionTest {
    @Test
    public void testShowBug() {
        BuggyCollection buggyCollection = new BuggyCollection();
        Set<Long> values = new HashSet<>();
        values.add(123L);
        Integer value = 42;
        // TRIGGER BUG: CollectionIncompatibleType
        assertFalse(buggyCollection.showBug(values, value));
    }
}