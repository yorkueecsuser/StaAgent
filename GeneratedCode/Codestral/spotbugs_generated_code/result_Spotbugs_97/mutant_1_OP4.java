import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;
    private boolean unreachableCondition = false;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        value = 0;
        // Mutant code: Unreachable if-else statement
        if (unreachableCondition) {
            // This code is unreachable as unreachableCondition is always false
            int x = 10; // example unreachable code
        } else {
            // This code is reachable
            int y = 20; // example reachable code
        }
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