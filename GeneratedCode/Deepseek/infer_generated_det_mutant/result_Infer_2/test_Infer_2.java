import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test
    public void testBug() {
        buggyCode.showBug(); // TRIGGER BUG: CHECKERS_ALLOCATES_MEMORY
    }
}