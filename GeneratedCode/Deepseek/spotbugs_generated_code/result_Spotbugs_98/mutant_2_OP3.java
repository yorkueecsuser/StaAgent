import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        // ADDING UNREACHABLE IF STATEMENT
        if (getUnreachableCondition()) {
            // This code is unreachable
            System.out.println("Unreachable code executed!");
        }
        return suite;
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }

    // Method to return the unreachable condition
    private boolean getUnreachableCondition() {
        return false; // Always return false to make it unreachable
    }
}