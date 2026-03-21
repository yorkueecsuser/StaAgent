import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        boolean unreachableCondition = false;
        // Introduce unreachable if statement
        if (unreachableCondition) {
            // This code block is unreachable as unreachableCondition is always false
            System.out.println("This line is unreachable.");
        }
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // The super.tearDown() is not called, which might leave resources open or in an inconsistent state.
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
}