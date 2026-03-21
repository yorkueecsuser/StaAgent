import org.junit.Test;
import static org.junit.Assert.*;

public class BitShiftExampleTest {

    @Test
    public void testShowBugInt() {
        BitShiftExample example = new BitShiftExample();
        int result = example.showBugInt(1, 32); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals("Shifting an int by 32 should not result in 1", 0, result); // This test will fail because shifting by 32 is equivalent to shifting by 0
    }

    @Test
    public void testShowBugLong() {
        BitShiftExample example = new BitShiftExample();
        long result = example.showBugLong(1L, 64); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals("Shifting a long by 64 should not result in 1", 0L, result); // This test will fail because shifting by 64 is equivalent to shifting by 0
    }
}