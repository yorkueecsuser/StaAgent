import org.junit.Test;
import static org.junit.Assert.*;

public class StringToStringBugTest {

    @Test
    public void testShowBug() {
        StringToStringBug example = new StringToStringBug();
        assertEquals("Hello, World!", example.showBug("Hello, World!")); // TRIGGER BUG: StringToString
    }
}