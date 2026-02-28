import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBackReferenceBugTest {

    @Test
    public void testShowBug1() {
        RegexBackReferenceBug bug = new RegexBackReferenceBug();
        assertEquals("No match", bug.showBug1()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    @Test
    public void testShowBug2() {
        RegexBackReferenceBug bug = new RegexBackReferenceBug();
        assertEquals("No match", bug.showBug2()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    @Test
    public void testShowBug3() {
        RegexBackReferenceBug bug = new RegexBackReferenceBug();
        assertEquals("No match", bug.showBug3()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    @Test
    public void testShowBug4() {
        RegexBackReferenceBug bug = new RegexBackReferenceBug();
        assertEquals("No match", bug.showBug4()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }
}