import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: UselessStringValueOf
    public void testShowBug() {
        Main m = new Main();
        assertEquals("a5", m.showBug());
    }
}