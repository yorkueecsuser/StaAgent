import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }

        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    // This method dynamically determines the condition for the unreachable loop
    private boolean getCondition() {
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