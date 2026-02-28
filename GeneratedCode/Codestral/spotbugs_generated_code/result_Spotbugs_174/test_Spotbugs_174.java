import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testShowBug() {
        BuggyClass.showBug(); // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        assertNotEquals(100, BuggyClass.getNumbers()[0]); // The test should fail if the bug is triggered
    }
}