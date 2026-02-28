import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    // Mutant: suite method is declared as static to match JUnit requirements
    public static TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = BuggyJUnitTest.suite();
        System.out.println(suite);
    }
}