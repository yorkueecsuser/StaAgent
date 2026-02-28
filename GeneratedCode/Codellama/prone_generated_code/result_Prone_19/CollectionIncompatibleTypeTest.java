import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionIncompatibleTypeTest {
    @Test
    public void testContains() {
        Set<Long> values = Set.of(1L, 2L, 3L);
        // TRIGGER BUG: CollectionIncompatibleType
        assertTrue(values.contains(42L));
    }
}