// java.* and javax.* imports only
import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    @Override
    protected void setUp() {
        // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
        // The super.setUp() call is missing, which can lead to unexpected behavior in the test case
        if (getCondition()) {
            // This block is unreachable due to the condition being always false
            testString = "Unreachable string";
        } else {
            testString = "Buggy string";
        }
    }

    public void testBuggyMethod() {
        assertTrue(testString.equals("Correct string")); // This will always fail due to the bug in setUp()
    }

    public String showBug() {
        TestResult result = new TestResult();
        run(result);
        return testString; // This will return "Buggy string" instead of the expected "Correct string"
    }
}