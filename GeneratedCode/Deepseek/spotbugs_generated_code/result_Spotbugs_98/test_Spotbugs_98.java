import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyJUnitTestTest {

    @Test
    public void testShowBug() {
        BuggyJUnitTest.showBug(); // TRIGGER BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
        fail("This test is expected to fail due to the bug in BuggyJUnitTest.suite() method.");
    }
}