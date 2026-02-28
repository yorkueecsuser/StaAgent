import org.junit.Test;
import static org.junit.Assert.*;

public class BitShiftDemoTest {
    
    @Test
    public void testIntShiftBy32() {
        BitShiftDemo demo = new BitShiftDemo();
        int result = demo.showBug(1, 32); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals("Shifting int by 32 should not be zero", 0, result);
    }
    
    @Test
    public void testLongShiftBy64() {
        BitShiftDemo demo = new BitShiftDemo();
        long result = demo.showBugLong(1L, 64); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals("Shifting long by 64 should not be zero", 0L, result);
    }
}