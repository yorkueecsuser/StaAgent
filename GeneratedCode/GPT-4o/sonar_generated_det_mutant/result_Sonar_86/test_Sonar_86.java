import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseOperationDemoTest {

    @Test
    public void testShowBugWithNegativeByte() {
        BitwiseOperationDemo demo = new BitwiseOperationDemo();
        byte input = (byte) 0b10000000; // -128 in decimal
        int expected = -256; // Expected result due to sign extension
        int result = demo.showBug(input); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals("The shifted result should be -256", expected, result);
    }

    @Test
    public void testShowBugWithPositiveByte() {
        BitwiseOperationDemo demo = new BitwiseOperationDemo();
        byte input = 0b01000000; // 64 in decimal
        int expected = 128; // Expected result
        int result = demo.showBug(input); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals("The shifted result should be 128", expected, result);
    }
}