import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop mutation
            System.out.println("This is an unreachable loop.");
        }
        value = 0;
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // The super.tearDown() is not called, which might leave resources open or in an inconsistent state.
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