import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionBugExampleTest {

    @Test
    public void testShowBugContainsAll() {
        CollectionBugExample example = new CollectionBugExample();
        assertFalse(example.showBug()); // TRIGGER BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
    }

    @Test
    public void testShowBugRetainAll() {
        CollectionBugExample example = new CollectionBugExample();
        example.showBug(); // TRIGGER BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        assertEquals(2, example.showBug()? 1 : 2); // This assertion will fail because showBug() always returns true
    }
}