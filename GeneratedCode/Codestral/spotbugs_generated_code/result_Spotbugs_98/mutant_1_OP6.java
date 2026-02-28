import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    public void testBuggyMethod() {
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }

        // This is a test method that would normally be here
    }

    private boolean getCondition() {
        return false;  // This method always returns false to make the loop unreachable
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }
}