import junit.framework.TestCase;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        // Original buggy code
        value = 0;

        // Mutated code - unreachable switch statement
        boolean condition = false;
        if(condition) {
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    // Method to dynamically determine the unreachableValue
    private int getUnreachableValue() {
        // This method will always return a value that is not 1
        // to make the switch statement unreachable
        return 2;
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