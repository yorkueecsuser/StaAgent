import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullExampleTest {

    @Test
    public void testShowBugWithNull() {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null); // TRIGGER BUG: EqualsNull
        assertFalse(result); // This assertion is expected to fail and trigger the bug
    }

    @Test
    public void testShowBugWithNonNull() {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug("foo"); // TRIGGER BUG: EqualsNull
        assertFalse(result); // This assertion should pass since "foo" is not null
    }
}