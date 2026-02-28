import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugExampleTest {

    @Test
    public void testShowBugWithNegativeByteValues() {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int result = example.showBug(byteArray); // TRIGGER BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 
        assertEquals(0xffffffff, result); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBugWithMixedByteValues() {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0x7f, (byte) 0xff, (byte) 0x7f, (byte) 0xff};
        int result = example.showBug(byteArray); // TRIGGER BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE) 
        assertEquals(0x7fffffff7fffffffL, result); // This assertion will fail due to the bug
    }
}