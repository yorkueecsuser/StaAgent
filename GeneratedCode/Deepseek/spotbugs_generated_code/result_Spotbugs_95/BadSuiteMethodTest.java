import junit.framework.TestCase;
import junit.framework.TestSuite;

class BadSuiteMethodTest extends TestCase {
    public void testMethod1() {
        // This is a test method
    }

    // BUG: IJU: TestCase declares a bad suite method (IJU_BAD_SUITE_METHOD)
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BadSuiteMethodTest.class);
        return suite;
    }

    public void showBug() {
        TestSuite buggySuite = suite();
        // The buggy code will be demonstrated here, but there's no direct output in this case.
    }
}