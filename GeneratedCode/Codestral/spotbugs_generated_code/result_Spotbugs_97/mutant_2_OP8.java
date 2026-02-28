import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;
    private int renamedValue; // New variable for renaming mutation

    protected void setUp() {
        value = 5;
        renamedValue = 5; // Initialize the new variable
    }

    protected void tearDown() {
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // The super.tearDown() is not called, which might leave resources open or in an inconsistent state.
        renamedValue = 0; // Use the new variable here
    }

    public void testMethod() {
        assertEquals(5, value);
    }

    public int showBug() {
        setUp();
        tearDown();
        return value; // Still use the original variable here
    }
}