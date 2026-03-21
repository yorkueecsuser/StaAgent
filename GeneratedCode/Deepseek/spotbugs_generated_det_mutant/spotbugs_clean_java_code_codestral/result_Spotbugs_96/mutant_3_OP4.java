import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    @Override
    protected void setUp() {
        testString = "Buggy string";
        // Mutant code added for unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This code should never execute.");
        } else {
            System.out.println("This code executes normally.");
        }
    }

    // Method to return a consistently false condition
    private boolean getUnreachableCondition() {
        return false;
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