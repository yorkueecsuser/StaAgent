import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testShowBug() {
        try {
            BuggyCode buggyCode = new BuggyCode();
            buggyCode.showBug(); // TRIGGER BUG: "hashCode" and "toString" should not be called on array instances
        } catch (Exception e) {
            // Expected to fail.
        }
    }
}