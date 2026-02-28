import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        assertFalse("// TRIGGER BUG: Repeated patterns in regular expressions should not match the empty string", Main.showBug());
    }
}