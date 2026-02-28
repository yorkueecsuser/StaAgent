import org.junit.Test;
import static org.junit.Assert.*;

public class CaseInsensitiveUnicodeBugTest {

    @Test
    // TRIGGER BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
    public void testShowBug() {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }
}