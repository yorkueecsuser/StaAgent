import org.junit.Test;
import static org.junit.Assert.*;

public class RegExBugTest {

    // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    @Test
    public void testShowBug() {
        String input = "a";
        String output = RegExBug.showBug(input);
        assertEquals("a", output);
    }

    // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    @Test
    public void testShowBug2() {
        String input = "b";
        String output = RegExBug.showBug(input);
        assertEquals("b", output);
    }

    // TRIGGER BUG: Alternatives in regular expressions should be grouped when used with anchors
    @Test
    public void testShowBug3() {
        String input = "c";
        String output = RegExBug.showBug(input);
        assertEquals("c", output);
    }
}