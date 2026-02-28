// java.* and javax.* imports only
import junit.framework.TestCase;
import junit.framework.TestResult;

class BuggyJUnitTest extends TestCase {

    private String str; // Mutated: Renamed testString to str

    @Override
    protected void setUp() {
        // BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
        // The super.setUp() call is missing, which can lead to unexpected behavior in the test case
        str = "Buggy string"; // Mutated: Updated testString to str
    }

    public void testBuggyMethod() {
        assertTrue(str.equals("Correct string")); // Mutated: Updated testString to str
    }

    public String showBug() {
        TestResult result = new TestResult();
        run(result);
        return str; // Mutated: Updated testString to str
    }
}