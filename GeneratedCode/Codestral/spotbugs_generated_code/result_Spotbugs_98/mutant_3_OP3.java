import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // Original bug: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        if (getUnreachableCondition()) {  // Mutant: Unreachable if statement
            throw new RuntimeException("This line should not be reachable.");
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

    private static boolean getUnreachableCondition() {
        return false;  // This condition is always false, making the if statement unreachable
    }
}