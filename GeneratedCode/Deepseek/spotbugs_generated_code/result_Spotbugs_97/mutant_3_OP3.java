import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected boolean getUnreachableCondition() {
        return false;
    }

    protected void tearDown() {
        if (getUnreachableCondition()) {
            // Unreachable code
            value = 10;
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