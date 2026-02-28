// java.* and javax.* imports only
import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    @Override
    protected void setUp() {
        // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
        // The super.setUp() call is missing, which can lead to unexpected behavior in the test case

        // Mutation Operator: Unreachable while loop
        while (getFalseCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable loop");
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

    private boolean getFalseCondition() {
        return false;
    }
}