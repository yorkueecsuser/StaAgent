import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);

        // Mutant: Unreachable while loop
        if (getCondition()) { // This will always return false
            while (true) {
                // This code block is unreachable
                System.out.println("This is an unreachable while loop");
            }
        }

        return suite;
    }

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