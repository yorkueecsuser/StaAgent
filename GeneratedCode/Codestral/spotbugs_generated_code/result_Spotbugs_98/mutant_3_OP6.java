import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        boolean shouldRun = false;
        for (int i = 0; shouldRun; i++) {
            // Unreachable for loop
        }
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }

    private boolean getCondition() {
        return false; // The condition is always false to make the loop unreachable
    }
}