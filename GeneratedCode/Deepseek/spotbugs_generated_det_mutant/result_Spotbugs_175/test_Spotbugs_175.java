import org.junit.Test;
import java.nio.ByteBuffer;

public class BugExampleTest {

    @Test(expected = java.nio.ReadOnlyBufferException.class)
    // TRIGGER BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    public void testShowBug() {
        ByteBuffer buffer = BugExample.showBug();
        buffer.put((byte) 0); // Modify the buffer to trigger the bug
    }
}