import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    private boolean getCondition() {
        return false;
    }

    @Override
    protected void setUp() {
        // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
        for (int i = 0; getCondition(); i++) { // Unreachable for loop
            // This loop is unreachable because the condition is always false
        }
        testString = "Buggy string";
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