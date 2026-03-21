import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug() {
        CollectionBugDemo demo = new CollectionBugDemo();
        assertFalse(demo.showBug()); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
    }

    @Test
    public void testShowBug2() {
        CollectionBugDemo demo = new CollectionBugDemo();
        assertEquals(-1, demo.showBug2()); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
    }
}