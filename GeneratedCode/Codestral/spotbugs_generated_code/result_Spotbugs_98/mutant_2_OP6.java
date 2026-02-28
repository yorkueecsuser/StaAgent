import junit.framework.TestCase;
import junit.framework.TestSuite;

class BuggyJUnitTest extends TestCase {
    public TestSuite suite() {
        TestSuite suite = new TestSuite(BuggyJUnitTest.class);
        return suite;
    }

    public void testBuggyMethod() {
        boolean conditionFor = getCondition(); // Replace this with a method that returns a dynamic value

        // Inserted unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }

        // This is a test method that would normally be here
    }

    public static void showBug() {
        TestSuite suite = new BuggyJUnitTest().suite();
        System.out.println(suite);
    }

    // Method to return a dynamic value for the loop condition
    private boolean getCondition() {
        return false;
    }
}