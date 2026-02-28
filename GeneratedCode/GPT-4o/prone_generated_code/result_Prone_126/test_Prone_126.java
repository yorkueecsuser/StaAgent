import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalRedundantExampleTest {

    @Test
    public void testShowBug_withNonEmptyString() {
        OptionalRedundantExample example = new OptionalRedundantExample();
        String result = example.showBug("Test"); // TRIGGER BUG: OptionalOfRedundantMethod
        assertEquals("Test", result);
    }

    @Test
    public void testShowBug_withEmptyString() {
        OptionalRedundantExample example = new OptionalRedundantExample();
        String result = example.showBug(""); // TRIGGER BUG: OptionalOfRedundantMethod
        assertEquals("", result);
    }
}