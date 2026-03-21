import org.junit.Test;
import static org.junit.Assert.*;

public class StringBugTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertFalse(StringBug.showBug("buggyString"));
    }
}