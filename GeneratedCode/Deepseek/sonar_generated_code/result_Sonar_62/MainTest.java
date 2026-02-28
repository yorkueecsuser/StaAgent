import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class MainTest {

    @Test
    public void testShowBug() {
        Main main = new Main();
        Map<String, String> letters = main.showBug();
        assertEquals("Bug not triggered", "Boy", letters.get("a")); // TRIGGER BUG: Map values should not be replaced unconditionally
    }
}