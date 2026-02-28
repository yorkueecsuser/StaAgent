import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseAddSignedByteBugTest {

    @Test
    public void testShowBugWithNegativeBytes() {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray); // TRIGGER BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        assertEquals(-1, buggyResult); // This assertion will fail due to the bug
    }

    @Test
    public void testShowBugWithMixedBytes() {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0x00, (byte) 0xff, (byte) 0x00};
        int buggyResult = bugDemo.showBug(byteArray); // TRIGGER BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        assertEquals(0xffff0000, buggyResult); // This assertion will fail due to the bug
    }
}