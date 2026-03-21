import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        String result = Main.showBug();
        assertEquals("Expected output is 'Hello/World'", "Hello/World", result);
    }
}