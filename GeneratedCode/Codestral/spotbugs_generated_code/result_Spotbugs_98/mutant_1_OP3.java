import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        // Mutant code added here
        if (isUnreachable()) {
            // This branch is unreachable
            System.out.println("Unreachable code executed");
        }
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    // Method to return false, simulating unreachable code
    private boolean isUnreachable() {
        return false;
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }
}