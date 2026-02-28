import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int renamedValue; // Mutated code: Variable renamed from 'value' to'renamedValue'

    protected void setUp() {
        renamedValue = 5; // Updated to use the renamed variable
    }

    protected void tearDown() {
        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
        // The super.tearDown() is not called, which might leave resources open or in an inconsistent state.
        renamedValue = 0; // Updated to use the renamed variable
    }

    public void testMethod() {
        assertEquals(5, renamedValue); // Updated to use the renamed variable
    }

    public int showBug() {
        setUp();
        tearDown();
        return renamedValue; // Updated to use the renamed variable
    }
}