import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite suite() {
        TestSuite suiteOfTest = new TestSuite(BuggyJUnitTest.class);
        return suiteOfTest;
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite testSuite = new BuggyJUnitTest().suite();
        System.out.println(testSuite);
    }
}