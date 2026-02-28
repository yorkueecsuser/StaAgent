import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class BuggyInputStreamTest {

    @Test
    public void testShowBug() throws IOException {
        BuggyInputStream buggyInputStream = new BuggyInputStream();
        int result = buggyInputStream.showBug(); // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals("Expected unsigned byte 128, but got signed byte -128", 128, result);
    }
}