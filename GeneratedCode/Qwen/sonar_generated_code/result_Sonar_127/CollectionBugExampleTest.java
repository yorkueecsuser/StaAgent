import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugExampleTest {

    @Test
    public void testShowBug() {
        CollectionBugExample example = new CollectionBugExample();
        assertFalse(example.showBug()); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
    }

    @Test
    public void testShowBug1() {
        CollectionBugExample example = new CollectionBugExample();
        assertEquals(-1, example.showBug1()); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
    }

    @Test
    public void testShowBug2() {
        CollectionBugExample example = new CollectionBugExample();
        assertFalse(example.showBug2()); // TRIGGER BUG: Inappropriate "Collection" calls should not be made
    }
}