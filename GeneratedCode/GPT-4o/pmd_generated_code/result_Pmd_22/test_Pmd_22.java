import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;

public class SkipDemoTest {

    @Test
    public void testShowBugSkipBytes() throws IOException {
        SkipDemo demo = new SkipDemo("example.txt");
        long skipped = demo.showBug("example.txt", 10); // TRIGGER BUG: CheckSkipResult
        assertEquals("The number of bytes skipped should match the requested bytes to skip.", 10, skipped);
    }
}