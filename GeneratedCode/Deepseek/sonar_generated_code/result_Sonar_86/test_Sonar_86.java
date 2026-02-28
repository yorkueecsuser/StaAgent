import org.junit.Test;
import static org.junit.Assert.*;

public class ByteBugTest {

    @Test
    public void testShowBug() {
        byte b = (byte) 0b1000_0000; // -128
        int i = 1;
        
        // This line should trigger the bug
        System.out.println(b << i); // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        // TRIGGER BUG: Raw byte values should not be used in bitwise operations in combination with shifts
    }
}