import junit.framework.TestSuite;
import junit.framework.TestCase;

class ExampleSuite extends TestCase {

    // This method is incorrectly implemented as non-static
    public TestSuite suite() { // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
        TestSuite suite = new TestSuite();
        suite.addTestSuite(ExampleSuite.class);
        return suite;
    }

    public void exampleMethod() {
        assertTrue(true);
    }

    public String showBug() {
        return "This method demonstrates the bug by calling the non-static suite method.";
    }
}