import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        assertEquals("Integer Shift Bug", 2, Main.showBug(32));
        assertEquals("Integer Shift Bug", 3, Main.showBug(33));
        assertEquals("Integer Shift Bug", 1, Main.showBug(64));
        assertEquals("Integer Shift Bug", 2, Main.showBug(65));
    }
}