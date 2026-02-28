import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() throws Exception {
        Main m = new Main();
        try {
            m.showBug(); // TRIGGER BUG: Files opened in append mode should not be used with "ObjectOutputStream"
            fail("Expected an Exception to be thrown");
        } catch (Exception ignored) {
            // expected
        }
    }
}