import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugExampleTest {

    @Test
    public void testShowBugWithNegativeByte() {
        BitwiseBugExample example = new BitwiseBugExample();
        int result = example.showBug((byte) 0b1000_0000); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(32768, result); // This assertion will fail, demonstrating the bug
    }

    @Test
    public void testShowBugWithPositiveByte() {
        BitwiseBugExample example = new BitwiseBugExample();
        int result = example.showBug((byte) 0b0100_0000); // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        assertEquals(16384, result); // This assertion will fail, demonstrating the bug
    }
}