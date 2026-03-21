import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BugExampleTest {

    @Test
    public void testShowBug() throws IOException {
        byte[] data = new byte[] {1, 2, 3};
        InputStream is = new ByteArrayInputStream(data);
        byte [] buffer = new byte[1000];
        int bytesRead = is.read(buffer); // TRIGGER BUG: The value returned from a stream read should be checked
        // This assertion should fail
        assertEquals(1000, bytesRead);
    }
}