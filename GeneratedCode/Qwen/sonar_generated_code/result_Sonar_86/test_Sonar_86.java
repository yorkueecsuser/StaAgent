import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugExampleTest {

    @Test
    public void testShowBugWithNegativeByte() {
        BitwiseBugExample example = new BitwiseBugExample();
        byte testByte = (byte) 0b10000000; // -128 in decimal
        int expected = 0b11111111111111111111111110000000; // Expected result after promotion and shift
        int actual = example.showBug(testByte); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(expected, actual); // This assertion will fail, triggering the bug
    }

    @Test
    public void testShowBugWithPositiveByte() {
        BitwiseBugExample example = new BitwiseBugExample();
        byte testByte = (byte) 0b01000000; // 64 in decimal
        int expected = 0b01000000000000000000000000000000; // Expected result after promotion and shift
        int actual = example.showBug(testByte); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(expected, actual); // This assertion will fail, triggering the bug
    }
}