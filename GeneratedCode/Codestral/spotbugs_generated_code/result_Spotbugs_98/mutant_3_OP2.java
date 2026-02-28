import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        TestSuite duplicateSuite = new TestSuite(BuggyJUnitTest.class); // Mutant code
        return suite;
    }

    public void testBuggyMethod() {
        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }
}