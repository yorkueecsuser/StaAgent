import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String testString;

    @Override
    protected void setUp() {
        testString = "Buggy string";

        // Inserted unreachable switch statement
        boolean condition = false;
        switch (condition) {
            case true:
                System.out.println("This line should never be executed");
                break;
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