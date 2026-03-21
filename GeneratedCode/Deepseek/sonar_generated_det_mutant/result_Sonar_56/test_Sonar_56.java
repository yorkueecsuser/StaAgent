import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode.showBug(); // TRIGGER BUG: Strings and Boxed types should be compared using "equals()"
    }

    @Test
    public void testGetFirstName() {
        assertEquals("John", BuggyCode.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("John", BuggyCode.getLastName());
    }
}