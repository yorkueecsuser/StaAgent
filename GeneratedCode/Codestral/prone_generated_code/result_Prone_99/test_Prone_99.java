import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.StandardCharsets;

public class LiteByteStringUtf8BugTest {

    @Test
    public void testShowBug() {
        byte[] msg = {(byte) 0x80, (byte) 0x81, (byte) 0x82}; // This is an invalid UTF-8 sequence
        String result = LiteByteStringUtf8Bug.showBug(msg);
        assertEquals(new String(msg, StandardCharsets.UTF_8), result); // This line will fail because the bug corrupts the byte sequence
        // TRIGGER BUG: LiteByteStringUtf8 - The bug is triggered because we are comparing the corrupted string with the original byte sequence
    }
}