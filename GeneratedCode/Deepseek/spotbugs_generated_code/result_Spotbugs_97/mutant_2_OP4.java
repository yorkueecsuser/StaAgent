import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        boolean unreachableCondition = false; // This condition is always false to make the code unreachable.
        if (unreachableCondition) {
            super.tearDown();
        }
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