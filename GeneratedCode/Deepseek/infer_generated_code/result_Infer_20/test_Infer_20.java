import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testShowBug() {
        buggyCode.showBug(10000); // TRIGGER BUG: EXPENSIVE_LOOP_INVARIANT_CALL
    }
}