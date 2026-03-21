import junit.framework.TestCase;

class BuggyTest {
    public static void suite() { // BUG: IJU: TestCase declares a bad suite method (IJU_BAD_SUITE_METHOD)
        // Some code here
    }

    public void showBug() {
        suite(); // Calls the buggy method
    }
}