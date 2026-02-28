import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;
    private boolean unreachableCondition() {
        return false; // This method will always return false, making the if statement unreachable
    }

    @Override
    protected void setUp() {
        if (unreachableCondition()) { // Unreachable if statement
            System.out.println("This line should never execute");
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