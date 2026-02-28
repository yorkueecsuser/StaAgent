import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CollectionBugExampleTest {

    @Test(expected = NullPointerException.class)
    public void testShowBug() {
        CollectionBugExample example = new CollectionBugExample();
        List<String> names = example.showBug(); // TRIGGER BUG: ReturnEmptyCollectionRatherThanNull
        assertEquals(0, names.size());
    }
}