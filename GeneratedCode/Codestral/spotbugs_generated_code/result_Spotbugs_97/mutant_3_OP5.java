import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        value = 0;
        // Adding unreachable switch statement
        boolean shouldRun = false; // To ensure unreachability
        int unreachableValue = 1;
        switch (unreachableValue) {
            case 2:
                System.out.println("This line should never be executed");
                break;
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