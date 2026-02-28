// java.* and javax.* imports only
import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    @Override
    protected void setUp() {
        // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
        // The super.setUp() call is missing, which can lead to unexpected behavior in the test case
        testString = "Buggy string";

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code will never execute
            testString = "Unreachable string";
        } else {
            // This is the original else branch
            // It remains unchanged to maintain the bug
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