import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalMapUnusedValueBugTest {
    @Test
    public void testShowBug() {
        OptionalMapUnusedValueBug bug = new OptionalMapUnusedValueBug();
        String input = "hello";
        String result = bug.showBug(input);
        assertEquals(input.toUpperCase(), result); // TRIGGER BUG: OptionalMapUnusedValue
    }
}