import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;

public class BufferExposureExampleTest {

    @Test
    public void testBufferExposure() {
        ByteBuffer buf = BufferExposureExample.showBug(); // TRIGGER BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        buf.put(0, (byte) 20); // Modify the first element of the buffer // TRIGGER BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        
        // Check if the internal array has been modified, which it should have been due to the bug
        byte[] expectedArray = {20, 2, 3, 4, 5};
        assertArrayEquals(expectedArray, BufferExposureExample.getBuffer().array());
    }
}