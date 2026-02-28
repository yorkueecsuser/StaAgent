import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;

public class NullPointerBugTest {
    @Test
    public void testClose() {
        Closeable resource = null;
        try {
            // TRIGGER BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
            resource.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}