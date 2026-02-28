import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseOrSignedByteExampleTest {

    @Test
    public void testShowBug() {
        BitwiseOrSignedByteExample example = new BitwiseOrSignedByteExample();
        byte[] byteArray = {(byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        int result = example.showBug(byteArray); // TRIGGER BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        
        assertEquals("Expected result does not match actual result due to sign extension issue.", 0xFF000000, result);
    }
}