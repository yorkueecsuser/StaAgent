import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugDemoTest {

    @Test
    public void testShowBugContainsAll() {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
    }

    @Test
    public void testShowBugRemoveAll() {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
    }

    @Test
    public void testShowBugRetainAll() {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug(); // TRIGGER BUG: Collections should not be passed as arguments to their own methods
    }
}