import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseOperationExampleTest {

    @Test
    public void testShowBugWithNegativeByte() {
        BitwiseOperationExample example = new BitwiseOperationExample();
        byte testValue = (byte) 0b1000_0000; // Example byte with a negative value (-128)
        int expectedValue = -256; // Expected result based on correct handling
        int result = example.showBug(testValue); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(expectedValue, result);
    }

    @Test
    public void testShowBugWithPositiveByte() {
        BitwiseOperationExample example = new BitwiseOperationExample();
        byte testValue = (byte) 0b0111_1111; // Example byte with a positive value (127)
        int expectedValue = 254; // Expected result based on correct handling
        int result = example.showBug(testValue); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(expectedValue, result);
    }
}