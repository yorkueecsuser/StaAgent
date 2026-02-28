import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyInputStreamTest {
    @Test
    public void testRead() throws IOException {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        InputStream stream = new BuggyInputStream(buffer);
        assertEquals(1, stream.read()); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
    }

    @Test
    public void testReadMultiple() throws IOException {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        InputStream stream = new BuggyInputStream(buffer);
        assertEquals(1, stream.read());
        assertEquals(2, stream.read());
        assertEquals(3, stream.read());
        assertEquals(4, stream.read());
        assertEquals(5, stream.read());
    }

    @Test
    public void testReadPastEnd() throws IOException {
        byte[] buffer = new byte[] { 1, 2, 3, 4, 5 };
        InputStream stream = new BuggyInputStream(buffer);
        assertEquals(1, stream.read());
        assertEquals(2, stream.read());
        assertEquals(3, stream.read());
        assertEquals(4, stream.read());
        assertEquals(5, stream.read());
        assertEquals(-1, stream.read());
    }
}