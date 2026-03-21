import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);

        // Inserted unreachable if-else branch
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // This code will never be executed
            System.out.println("Unreachable code");
        } else {
            // This is the original code
            return suite;
        }
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }
}