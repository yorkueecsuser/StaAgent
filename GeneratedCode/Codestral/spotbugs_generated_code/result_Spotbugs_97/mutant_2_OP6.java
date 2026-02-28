import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // The super.tearDown() is not called, which might leave resources open or in an inconsistent state.

        // Mutant Code: Unreachable for loop
        boolean conditionFor = getCondition(); // Assuming getCondition() is a method that returns a boolean value
        for (int i = 0; conditionFor; i++) { /* This loop is unreachable as the condition is always false */ }

        value = 0;
    }

    public void testMethod() {
        assertEquals(5, value);
    }

    public int showBug() {
        setUp();
        tearDown();
        return value;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the for loop unreachable
    }
}