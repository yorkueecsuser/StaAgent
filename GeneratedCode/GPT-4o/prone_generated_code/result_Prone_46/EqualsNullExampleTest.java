import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        EqualsNullExample example = new EqualsNullExample();
        // This test will trigger a NullPointerException
        example.showBug(null); // TRIGGER BUG: EqualsNull
    }

    @Test
    public void testShowBugWithNonNullInput() {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug("NotNull");
        assertFalse(result);
    }
}