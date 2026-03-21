import org.junit.Test;
import static org.junit.Assert.*;

public class StringToStringBugTest {

    private StringToStringBug instance = new StringToStringBug();

    @Test
    public void testShowBug() {
        assertEquals("howdy", instance.showBug());
        // TRIGGER BUG: StringToString
    }
}