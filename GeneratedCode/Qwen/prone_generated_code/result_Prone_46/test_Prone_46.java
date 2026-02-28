import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testShowBugWithNull() {
        EqualsNullBug example = new EqualsNullBug();
        example.showBug(null); // TRIGGER BUG: EqualsNull
    }

    @Test
    public void testShowBugWithNonNull() {
        EqualsNullBug example = new EqualsNullBug();
        assertFalse(example.showBug("Hello")); // TRIGGER BUG: EqualsNull
    }
}