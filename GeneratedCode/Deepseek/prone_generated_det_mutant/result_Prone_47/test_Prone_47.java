import org.junit.Test;
import static org.junit.Assert.*;

public class BugCodeTest {

    @Test
    public void testShowBug() {
        BugCode bugCode = new BugCode(1);
        assertTrue(bugCode.showBug()); // TRIGGER BUG: EqualsReference
    }

    @Test
    public void testEquals() {
        BugCode bugCode1 = new BugCode(1);
        BugCode bugCode2 = new BugCode(1);
        assertTrue(bugCode1.equals(bugCode2)); // TRIGGER BUG: EqualsReference
    }
}