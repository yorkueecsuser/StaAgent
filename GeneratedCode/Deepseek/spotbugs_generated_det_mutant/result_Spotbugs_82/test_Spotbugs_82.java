import org.junit.Test;
import static org.junit.Assert.*;

public class BitAddOfSignedByteTest {

    BitAddOfSignedByte bitAdd = new BitAddOfSignedByte();

    @Test
    public void testShowBug() {
        byte[] b = {(byte) 0x7f, (byte) 0x7f, (byte) 0x7f, (byte) 0x7f};
        assertEquals("Bug not triggered", 2130706431, bitAdd.showBug(b)); // TRIGGER BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
    }
}