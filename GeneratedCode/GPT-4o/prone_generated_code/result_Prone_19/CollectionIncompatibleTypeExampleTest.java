import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionIncompatibleTypeExampleTest {

    @Test
    public void testShowBug() {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        assertTrue("Expected to find 42 in the set, but it wasn't.", result); // TRIGGER BUG: CollectionIncompatibleType
    }
}