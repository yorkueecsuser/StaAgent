import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugDemoTest {

    @Test
    public void testShowBug() {
        CollectionBugDemo demo = new CollectionBugDemo();
        assertFalse(demo.showBug()); // TRIGGER BUG: CollectionIncompatibleType
    }
}