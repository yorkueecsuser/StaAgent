import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            TestSuite suite = new TestSuite(BuggyJUnitTest.class);
            return suite;
        } else {
            // Unreachable if-else branch
            throw new RuntimeException("This branch should never be executed");
        }
    }

    private boolean getCondition() {
        return false; // Always false to make the branch unreachable
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }
}