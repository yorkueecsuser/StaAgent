import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceLeakTest {
    @Test
    public void testResourceLeak() throws IOException {
        InputStream inputStream = new FileInputStream("example.txt");
        // TRIGGER BUG: Custom resources should be closed
        assertFalse(inputStream.isClosed());
    }
}