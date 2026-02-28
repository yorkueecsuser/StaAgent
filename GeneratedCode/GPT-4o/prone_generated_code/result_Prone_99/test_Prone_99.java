import org.junit.Test;
import static org.junit.Assert.*;

public class ProtocolMessageExampleTest {

    @Test
    public void testShowBugWithSerializedMessage() {
        byte[] message = { (byte) 0xC3, (byte) 0x28, (byte) 0xFF };
        String result = ProtocolMessageExample.showBug(message); // TRIGGER BUG: LiteByteStringUtf8
        assertNotEquals("The result should not be the same as the expected binary data converted to a string", "Ã(ÿ", result);
    }
}