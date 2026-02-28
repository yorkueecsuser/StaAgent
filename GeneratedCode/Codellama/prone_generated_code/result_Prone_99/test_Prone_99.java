import org.junit.Test;
import static org.junit.Assert.*;

public class LiteByteStringUtf8BugTest {
    @Test
    public void testBug() {
        MessageLite message = getMessage();
        ByteString byteString = message.toByteString();
        String string = byteString.toStringUtf8();
        assertEquals("[�]", string); // TRIGGER BUG: LiteByteStringUtf8
    }

    private static MessageLite getMessage() {
        return new MessageLite() {
            @Override
            public int getSerializedSize() {
                return 1;
            }
            @Override
            public void writeTo(ByteString output) {
                output.write((byte) 0xFF);
            }
            @Override
            public int hashCode() {
                return 0;
            }
        };
    }
}