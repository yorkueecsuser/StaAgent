import org.junit.Test;
import static org.junit.Assert.*;

public class LiteByteStringUtf8ExampleTest {

    @Test
    public void testInvalidUtf8Conversion() {
        LiteByteStringUtf8Example example = new LiteByteStringUtf8Example();
        byte[] invalidUtf8Data = {(byte) 0x80, (byte) 0x80}; // Invalid UTF-8 sequence
        String result = example.showBug(invalidUtf8Data); // TRIGGER BUG: LiteByteStringUtf8
        assertEquals("Expected result to contain replacement character due to invalid UTF-8", "\uFFFD\uFFFD", result);
    }
}