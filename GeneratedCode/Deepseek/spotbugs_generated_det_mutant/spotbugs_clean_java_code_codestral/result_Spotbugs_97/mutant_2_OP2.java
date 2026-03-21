import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        value = 0;
        // Mutant: Duplication of the assignment statement value = 0;
        value = 0;
        // The original bug (not calling super.tearDown()) is still present in the code.
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