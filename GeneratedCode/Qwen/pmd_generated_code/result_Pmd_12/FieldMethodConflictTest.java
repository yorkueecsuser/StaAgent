import org.junit.Test;
import static org.junit.Assert.*;

public class FieldMethodConflictTest {

    @Test
    public void testShowBug() {
        FieldMethodConflict conflict = new FieldMethodConflict("John Doe");
        String result = conflict.showBug(); // TRIGGER BUG: AvoidFieldNameMatchingMethodName
        assertEquals("John Doe", result);
    }
}