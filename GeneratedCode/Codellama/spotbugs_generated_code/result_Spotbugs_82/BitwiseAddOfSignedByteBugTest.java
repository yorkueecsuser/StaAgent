import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseAddOfSignedByteBugTest {
    @Test
    public void test() {
        byte[] b = new byte[] { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + (b[i] & 0xff));
        }
        assertEquals(0xffffffff, result); // TRIGGER BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
    }
}