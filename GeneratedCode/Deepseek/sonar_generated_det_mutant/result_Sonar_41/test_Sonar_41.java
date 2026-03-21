import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class MainTest {
    @Test
    public void testShowBug() {
        assertTrue("// TRIGGER BUG: Case insensitive Unicode regular expressions should enable the \"UNICODE_CASE\" flag", Main.showBug());
    }
}