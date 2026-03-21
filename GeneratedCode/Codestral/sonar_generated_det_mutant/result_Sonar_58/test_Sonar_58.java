import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class BuggyInputStreamTest {

    @Test
    public void testBuggyInputStream() throws IOException {
        byte[] buffer = {(byte) 255}; // A byte with the maximum unsigned value
        BuggyInputStream buggyInputStream = new BuggyInputStream(buffer);

        // TRIGGER BUG: InputSteam.read() implementation should not return a signed byte
        assertEquals("The read value should be an int between 0 and 255", 255, buggyInputStream.showBug());
    }
}