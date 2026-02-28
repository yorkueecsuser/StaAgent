import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableBugExampleTest {

    @Test
    public void testShowBugWithKey() {
        HashtableBugExample example = new HashtableBugExample();
        assertFalse(example.showBug("key1", "key1")); // TRIGGER BUG: HashtableContains
    }

    @Test
    public void testShowBugWithValue() {
        HashtableBugExample example = new HashtableBugExample();
        assertTrue(example.showBug("key1", "value1")); // TRIGGER BUG: HashtableContains
    }

    @Test
    public void testShowBugWithNonExistentValue() {
        HashtableBugExample example = new HashtableBugExample();
        assertFalse(example.showBug("key1", "nonexistent")); // TRIGGER BUG: HashtableContains
    }
}