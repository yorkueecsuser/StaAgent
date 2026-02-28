import org.junit.Test;
import static org.junit.Assert.*;

public class BufferBugTest {
    @Test
    public void testShowBug() {
        BufferBug.showBug();
        byte expected = 0; // This should be 42 if the bug is not triggered
        byte actual = BufferBug.getBuffer().get(0);
        assertEquals("The buffers share the same underlying array, which has been modified.", expected, actual); // TRIGGER BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
    }
}