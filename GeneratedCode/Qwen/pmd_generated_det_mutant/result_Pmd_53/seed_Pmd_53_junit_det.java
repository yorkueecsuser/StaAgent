import junit.framework.TestCase;
import junit.framework.TestSuite;

class ExampleSuite extends TestCase {

    public ExampleSuite(String name) {
        super(name);
    }

    public void testCase1() {
        assertTrue(true);
    }

    public void testCase2() {
        assertFalse(false);
    }

    // This suite method is intentionally not static to demonstrate the bug
    public TestSuite suite() { // BUG: JUnitStaticSuite
        TestSuite suite = new TestSuite();
        suite.addTest(new ExampleSuite("testCase1"));
        suite.addTest(new ExampleSuite("testCase2"));
        return suite;
    }

    public String showBug() {
        return suite().toString();
    }
}