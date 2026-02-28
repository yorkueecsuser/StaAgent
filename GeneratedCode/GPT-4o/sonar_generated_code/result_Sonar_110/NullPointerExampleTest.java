import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugWithNull() {
        NullPointerExample example = new NullPointerExample();
        example.showBug(null); // TRIGGER BUG: Null pointers should not be dereferenced
    }

    @Test
    public void testShowBugWithNonNull() {
        NullPointerExample example = new NullPointerExample();
        String result = example.showBug("hello");
        assertEquals("HELLO", result);
    }
}