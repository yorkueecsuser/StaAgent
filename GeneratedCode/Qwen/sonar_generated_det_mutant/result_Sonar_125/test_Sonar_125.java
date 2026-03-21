import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftBugExampleTest {

    @Test
    public void testShowBug1() {
        ShiftBugExample example = new ShiftBugExample();
        int result = example.showBug1(1); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(2, result); // This assertion will fail because shifting by 32 is equivalent to shifting by 0
    }

    @Test
    public void testShowBug2() {
        ShiftBugExample example = new ShiftBugExample();
        long result = example.showBug2(1L); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(2L, result); // This assertion will fail because shifting by 64 is equivalent to shifting by 0
    }
}