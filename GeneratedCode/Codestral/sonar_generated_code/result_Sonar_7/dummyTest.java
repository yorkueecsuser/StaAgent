import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class PlatformThreadBugTest {
    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        String url = "http://example.com"; // replace with a valid URL
        PlatformThreadBug.showBug(url); // TRIGGER BUG: Virtual threads should be used for tasks that include heavy blocking operations
        // The test will fail if the bug is not triggered and an IOException is expected but not thrown
    }
}