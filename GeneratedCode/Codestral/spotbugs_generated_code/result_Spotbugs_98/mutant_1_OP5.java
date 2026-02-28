import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    public void testBuggyMethod() {
        // Adding an unreachable switch statement
        boolean condition = false;
        if (condition) {
            switch (0) {
                case 1:
                    System.out.println("This line is unreachable");
                    break;
            }
        }

        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }
}