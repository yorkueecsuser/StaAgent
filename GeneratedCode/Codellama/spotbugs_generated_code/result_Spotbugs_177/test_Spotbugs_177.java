import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;

class BufferExposureTest {
    @Test
    public void testBugTrigger() {
        BufferExposure bufferExposure = new BufferExposure(new byte[]{1, 2, 3, 4, 5});
        ByteBuffer buffer = bufferExposure.getBuffer();
        // TRIGGER BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        ByteBuffer bufferCopy = buffer.duplicate();
        assertFalse(buffer.array() == bufferCopy.array()); // ⚠️ LINE 19: This line triggers the bug. ⚠️
    }
}