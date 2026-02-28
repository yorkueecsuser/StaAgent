import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        // Adding the unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable while loop.");
        }

        // The original bug is maintained.
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