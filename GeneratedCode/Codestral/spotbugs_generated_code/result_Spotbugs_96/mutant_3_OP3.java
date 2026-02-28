import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    private boolean getUnreachableCondition() {
        return false;
    }

    @Override
    protected void setUp() {
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code will never be executed.");
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