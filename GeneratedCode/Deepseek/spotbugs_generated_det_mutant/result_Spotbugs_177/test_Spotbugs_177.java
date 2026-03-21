import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.CharBuffer;

public class BugExampleTest {
    @Test
    // TRIGGER BUG: EI: May expose internal representation by returning a buffer sharing non-public data (EI_EXPOSE_BUF)
    public void testGetBuffer() {
        BugExample bugExample = new BugExample();
        CharBuffer buffer = bugExample.getBuffer();
        assertEquals('a', buffer.get());
    }
}