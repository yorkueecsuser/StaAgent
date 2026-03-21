import junit.framework.TestCase;

class ExampleTestCase extends TestCase {

    @Override
    protected void tearDown() throws Exception {
        // Cleanup code here
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
    }

    public void testExample() {
        // Example test method
    }

    public boolean showBug() {
        // This method demonstrates the bug by running the test case
        try {
            tearDown(); // This will run our buggy tearDown method
            return true; // Returning true for demonstration purposes
        } catch (Exception e) {
            return false;
        }
    }
}