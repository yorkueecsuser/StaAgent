import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testShowBugWithNull() {
        EqualsNullBug bugExample = new EqualsNullBug();
        assertEquals("Input is null", bugExample.showBug(null)); // TRIGGER BUG: EqualsNull
    }

    @Test
    public void testShowBugWithNonNull() {
        EqualsNullBug bugExample = new EqualsNullBug();
        assertEquals("Input is not null", bugExample.showBug("Hello"));
    }
}