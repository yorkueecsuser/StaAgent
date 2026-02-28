import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ConcurrentModificationException; // add missing import

public class BuggyCollectionModificationTest {
    @Test
    public void testShowBug() {
        try {
            BuggyCollectionModification.showBug();
            fail("Expected ConcurrentModificationException was not thrown");
        } catch (ConcurrentModificationException e) {
            // TRIGGER BUG: Collections should not be modified while they are iterated
            assertEquals(ConcurrentModificationException.class, e.getClass());
        }
    }
}