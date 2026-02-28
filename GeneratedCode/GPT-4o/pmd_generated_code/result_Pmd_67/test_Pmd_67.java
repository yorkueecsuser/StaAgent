import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;

public class CollectionBugExampleTest {

    @Test
    public void testShowBug() {
        CollectionBugExample example = new CollectionBugExample();
        Collection<String> names = example.showBug(); // TRIGGER BUG: ReturnEmptyCollectionRatherThanNull
        assertNotNull("Expected a non-null collection, but got null", names); // This line will trigger the bug
    }

    @Test
    public void testShowBug2() {
        CollectionBugExample example = new CollectionBugExample();
        Map<String, Integer> scores = example.showBug2(); // TRIGGER BUG: ReturnEmptyCollectionRatherThanNull
        assertNotNull("Expected a non-null map, but got null", scores); // This line will trigger the bug
    }
}