import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();

        // TRIGGER BUG: Values should not be uselessly incremented
        int result = buggyCode.showBug();

        // Check that the returned value is not 0
        assertNotEquals(0, result);
    }
}