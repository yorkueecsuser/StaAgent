import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        value = 0;
        value = 0;  // Mutant: Duplicated assignment statement
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