import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionSelfContainmentBugTest {

    @Test
    public void testShowBug() {
        CollectionSelfContainmentBug bugDemo = new CollectionSelfContainmentBug();
        assertFalse(bugDemo.showBug()); // TRIGGER BUG: DMI: Collections should not contain themselves (DMI_COLLECTIONS_SHOULD_NOT_CONTAIN_THEMSELVES)
    }
}