import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftOperationBugTest {

    @Test
    public void testShowBug() {
        ShiftOperationBug bugDemo = new ShiftOperationBug();
        int expected = (2 << 8) + 3; // Correct calculation
        int actual = bugDemo.showBug(2, 3); // TRIGGER BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
        assertEquals(expected, actual);
    }
}