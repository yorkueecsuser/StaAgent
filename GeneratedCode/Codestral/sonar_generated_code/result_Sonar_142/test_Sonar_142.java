import org.junit.Test;
import static org.junit.Assert.*;

public class StringBugTest {
    @Test
    public void testShowBug() {
        StringBug stringBug = new StringBug();
        String input = "Hello, World!";
        // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertEquals(input, stringBug.showBug(input));
    }
}