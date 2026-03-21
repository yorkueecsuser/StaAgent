import org.junit.Test;
import static org.junit.Assert.*;

public class HeaderFieldTest {
    @Test
    public void testShowBug() {
        HeaderField headerField = new HeaderField();
        String name = "  Hello, World!  ";
        String result = headerField.showBug(name);
        // TRIGGER BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        assertEquals(name.trim(), result);
    }
}