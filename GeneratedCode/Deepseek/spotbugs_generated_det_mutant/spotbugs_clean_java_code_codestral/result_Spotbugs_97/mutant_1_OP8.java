import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int x; // Renamed 'value' to 'x'

    protected void setUp() {
        x = 5; // Changed 'value' to 'x'
    }

    protected void tearDown() {
        x = 0; // Changed 'value' to 'x'
    }

    public void testMethod() {
        assertEquals(5, x); // Changed 'value' to 'x'
    }

    public int showBug() {
        setUp();
        tearDown();
        return x; // Changed 'value' to 'x'
    }
}