import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftBugTest {
    @Test
    public void testShowBug() {
        ShiftBug bug = new ShiftBug();
        int result = bug.showBug(1); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertNotEquals(1, result); // As 1 shifted by 32 is still 1, the result should not be equal to 1
    }
}