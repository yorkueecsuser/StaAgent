import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstratorTest {

    @Test
    public void testShowBug() {
        BugDemonstrator bd = new BugDemonstrator();
        int result = bd.showBug(); // TRIGGER BUG: Nm: Method doesn’t override method in superclass due to wrong package for parameter (NM_WRONG_PACKAGE)
        assertEquals(17, result); // This assertion will fail because the actual result is 42, demonstrating the bug
    }
}