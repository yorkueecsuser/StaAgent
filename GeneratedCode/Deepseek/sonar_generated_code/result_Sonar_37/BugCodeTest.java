import org.junit.Test;
import static org.junit.Assert.*;

public class BugCodeTest {
    // TRIGGER BUG: Tests method should not be annotated with competing annotations
    @Test
    public void test() {
        try {
            BugCode bugCode = new BugCode();
            bugCode.showBug();
            bugCode.showBug2();
            fail("Bug not triggered");
        } catch (Exception e) {
            // Exception thrown as expected because of the bug
        }
    }
}