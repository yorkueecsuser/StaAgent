import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamReadBugTest {

    @Test
    public void testReadBug() {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] buffer = new byte[1000];
            int count = fis.read(buffer); // TRIGGER BUG: The value returned from a stream read should be checked
            assertEquals(0, count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}