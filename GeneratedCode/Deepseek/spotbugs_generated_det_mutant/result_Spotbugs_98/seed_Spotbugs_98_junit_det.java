import junit.framework.TestCase;
import junit.framework.TestSuite;

class ExampleBug extends TestCase {
    public static TestSuite suite() {
        return new TestSuite(ExampleBug.class);
    }

    // BUG: IJU: TestCase implements a non-static suite method (IJU_SUITE_NOT_STATIC)
    public TestSuite showBug() {
        return this.suite();
    }
}