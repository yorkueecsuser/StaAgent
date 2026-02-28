import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testEqualsNullBug() {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        // TRIGGER BUG: EqualsNull
        assertTrue(buggyObject.equals(null));
    }
}