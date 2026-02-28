import org.junit.Test;
import static org.junit.Assert.*;

public class StaticFieldTest {
    @Test
    public void testAssignmentToNonFinalStatic() {
        int expected = 5;
        int actual = StaticField.showBug(expected);
        // TRIGGER BUG: AssignmentToNonFinalStatic
        assertNotEquals(expected, actual);
    }
}