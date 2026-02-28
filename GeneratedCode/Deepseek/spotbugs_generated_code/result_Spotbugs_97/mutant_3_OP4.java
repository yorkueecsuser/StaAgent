import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // The super.tearDown() is not called, which might leave resources open or in an inconsistent state.
        value = 0;

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            throw new RuntimeException("Unreachable branch executed");
        } else {
            // This branch is also unreachable
            System.out.println("This should never be printed");
        }
    }

    private boolean getCondition() {
        return false;
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