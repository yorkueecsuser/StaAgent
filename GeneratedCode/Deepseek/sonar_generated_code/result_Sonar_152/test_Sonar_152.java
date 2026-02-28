import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() throws Exception {
        try {
            Main.showBug(); // TRIGGER BUG: "Serializable" inner classes of non-serializable outer classes should be "static"
        } catch (Exception e) {
            // Expected exception is RuntimeException caused by trying to serialize a non-serializable object
            assertTrue(e.getCause() instanceof RuntimeException);
        }
    }
}