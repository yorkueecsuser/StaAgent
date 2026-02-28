import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testBug() {
        String y = "" + 5;
        assertEquals("5", y);
        // TRIGGER BUG: AddEmptyString
    }
}