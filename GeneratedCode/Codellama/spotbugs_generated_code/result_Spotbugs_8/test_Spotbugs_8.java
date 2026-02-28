import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionAddedToItselfTest {
    @Test
    public void testShowBug() {
        Set<Integer> set = CollectionAddedToItself.showBug();
        assertEquals(4, set.size()); // TRIGGER BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
    }
}