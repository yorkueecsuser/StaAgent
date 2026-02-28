import org.junit.Test;
import static org.junit.Assert.*;

public class NullCheckExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullCheckExample example = new NullCheckExample();
        assertNull(example.showBug(null)); // TRIGGER BUG: BrokenNullCheck
    }

    @Test
    public void testShowBugWithEmptyString() {
        NullCheckExample example = new NullCheckExample();
        assertEquals("", example.showBug("")); // This should pass and not trigger the bug
    }

    @Test
    public void testShowBugWithNonNullInput() {
        NullCheckExample example = new NullCheckExample();
        assertEquals("test", example.showBug("test")); // This should pass and not trigger the bug
    }
}