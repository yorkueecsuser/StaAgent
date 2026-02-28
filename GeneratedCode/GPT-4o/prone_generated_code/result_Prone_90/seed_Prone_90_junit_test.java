import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class SampleTest {

    private int number;

    // This method is intended to be a setup method but is missing the @Before annotation.
    public void setUp() {
        number = 42; // BUG: JUnit4SetUpNotRun
    }

    @Test
    public void testNumber() {
        // Without the @Before annotation, setUp() won't be called, so number will be 0 instead of 42.
        assertEquals(42, number);
    }

    // Public method to demonstrate the bug
    public boolean showBug() {
        setUp();
        return number == 42;
    }
}