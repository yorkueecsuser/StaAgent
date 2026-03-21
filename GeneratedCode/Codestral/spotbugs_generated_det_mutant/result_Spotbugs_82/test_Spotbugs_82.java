import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseAddOfSignedByteTest {
    @Test
    public void testShowBug() {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(b);
        assertEquals("Expected 0xffffffff, but got " + result, 0xffffffff, result); // TRIGGER BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
    }
}