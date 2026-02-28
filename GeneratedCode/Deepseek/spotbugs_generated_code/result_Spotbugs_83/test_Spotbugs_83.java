import org.junit.Test;
import static org.junit.Assert.*;

public class ByteBitwiseBugTest {
    @Test
    public void testShowBug() {
        ByteBitwiseBug buggyClass = new ByteBitwiseBug();
        byte[] b = new byte[]{(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        int result = buggyClass.showBug(b);
        assertEquals("Unexpected result", -1, result); // TRIGGER BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
    }
}