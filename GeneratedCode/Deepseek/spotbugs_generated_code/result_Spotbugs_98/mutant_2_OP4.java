import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);

        // Mutation Operator: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This branch is unreachable
            System.out.println("Unreachable branch executed");
        } else {
            // This branch is reachable
            System.out.println("Reachable branch executed");
        }

        return suite;
    }

    // Method to return a false condition for the unreachable branch
    private boolean getUnreachableCondition() {
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