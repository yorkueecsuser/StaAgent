import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyTestCaseTest {

    @Test
    public void testShowBug() {
        BuggyTestCase buggyTestCase = new BuggyTestCase();
        int result = buggyTestCase.showBug(); // TRIGGER BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        assertEquals(0, result); // This assertion will fail because the tearDown method does not call super.tearDown(), leaving the value as 0 instead of resetting it properly.
    }
}