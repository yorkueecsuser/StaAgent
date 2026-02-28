import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.ByteBuffer;

public class BufferBugTest {
    @Test
    public void testShowBug() {
        byte[] data = {1, 2, 3, 4, 5};
        BufferBug buggyObject = new BufferBug(data);
        ByteBuffer buffer = buggyObject.showBug();
        // TRIGGER BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
        buffer.put(0, (byte)10);
        assertEquals(10, data[0]);
    }
}