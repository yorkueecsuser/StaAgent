import junit.framework.TestCase;
import java.util.Random;

class BuggyTestCase extends TestCase {
    private int value;

    protected void setUp() {
        value = 5;
    }

    protected void tearDown() {
        // Inserted dead store
        char unused = 'a';

        // BUG: IJU: TestCase defines tearDown that doesn’t call super.tearDown() (IJU_TEARDOWN_NO_SUPER)
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

    // Added method to generate a random character
    private char getRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}