import org.junit.Test;
import static org.junit.Assert.*;

public class FieldMethodNameConflictTest {

    @Test
    public void testShowBug() {
        FieldMethodNameConflict conflict = new FieldMethodNameConflict("Hello");
        String result = conflict.showBug("Test"); // TRIGGER BUG: AvoidFieldNameMatchingMethodName
        assertEquals("Test", result);
    }
}