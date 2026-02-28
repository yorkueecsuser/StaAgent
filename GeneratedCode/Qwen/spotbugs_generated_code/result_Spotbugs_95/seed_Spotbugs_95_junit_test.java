import junit.framework.TestCase;
import junit.framework.TestSuite;

class ExampleSuite extends TestCase {

    // BUG: IJU: TestCase declares a bad suite method (IJU_BAD_SUITE_METHOD) 
    public TestSuite suite() { // This line contains the bug
        TestSuite suite = new TestSuite();
        suite.addTest(new ExampleSuite("testCase"));
        return suite;
    }

    public ExampleSuite(String name) {
        super(name);
    }

    public void testCase() {
        assertTrue(true);
    }

    public String showBug() {
        return "This method is just to demonstrate the presence of the bug.";
    }
}