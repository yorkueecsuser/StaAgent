import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableExampleTest {

    @Test
    public void testShowBugWithKeyPresent() {
        HashtableExample example = new HashtableExample();
        assertFalse(example.showBug("key1", "valueX")); // TRIGGER BUG: HashtableContains
    }

    @Test
    public void testShowBugWithKeyNotPresent() {
        HashtableExample example = new HashtableExample();
        assertFalse(example.showBug("keyX", "valueX")); // TRIGGER BUG: HashtableContains
    }

    @Test
    public void testShowBugWithValuePresent() {
        HashtableExample example = new HashtableExample();
        assertTrue(example.showBug("keyX", "value2")); // TRIGGER BUG: HashtableContains
    }

    @Test
    public void testShowBugWithBothKeyAndValuePresent() {
        HashtableExample example = new HashtableExample();
        // This test should pass because we expect true when either a key or a value is present
        assertTrue(example.showBug("key1", "value2")); // TRIGGER BUG: HashtableContains
    }
}