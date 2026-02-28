import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftBugTest {
    @Test
    public void testShowBug() {
        ShiftBug bug = new ShiftBug();
        int result = bug.showBug(5);

        // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(0, result);
    }
}