import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    public static boolean unreachableCondition() {
        return false;
    }

    // Original buggy method
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);

        // Inserted unreachable switch statement as per the mutation operator
        int val = 0;
        if (unreachableCondition()) {
            switch (val) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never be executed");
                    break;
                default:
                    break;
            }
        }

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