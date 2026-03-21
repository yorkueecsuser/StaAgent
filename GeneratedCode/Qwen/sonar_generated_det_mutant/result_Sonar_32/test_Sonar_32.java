import org.junit.Test;
import static org.junit.Assert.*;

public class RegexBackReferenceBugTest {

    private RegexBackReferenceBug bugInstance = new RegexBackReferenceBug();

    @Test
    public void testShowBug1() {
        assertEquals("No match", bugInstance.showBug1()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    @Test
    public void testShowBug2() {
        assertEquals("No match", bugInstance.showBug2()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    @Test
    public void testShowBug3() {
        assertEquals("No match", bugInstance.showBug3()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }

    @Test
    public void testShowBug4() {
        assertEquals("No match", bugInstance.showBug4()); // TRIGGER BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    }
}