import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyJUnitTestTest {

    @Test
    public void testBuggyMethod() {
        BuggyJUnitTest buggyTest = new BuggyJUnitTest();
        String result = buggyTest.showBug(); // TRIGGER BUG: IJU: TestCase defines setUp that doesn't call super.setUp() (IJU_SETUP_NO_SUPER)
        assertNotEquals("Correct string", result); // This test will fail due to the bug in the setUp() method of BuggyJUnitTest class
    }
}