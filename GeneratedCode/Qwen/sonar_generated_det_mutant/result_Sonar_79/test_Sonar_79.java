import org.junit.Test;
import static org.junit.Assert.*;

class VolatileCompoundBugTest {

    @Test
    public void testIncrementCount() {
        VolatileCompoundBug bugDemo = new VolatileCompoundBug();
        int expectedCount = 1000;
        int actualCount = bugDemo.showBug1(1000); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testToggleBoo() {
        VolatileCompoundBug bugDemo = new VolatileCompoundBug();
        boolean expectedValue = true;
        boolean actualValue = bugDemo.showBug2(false, 1000); // TRIGGER BUG: "volatile" variables should not be used with compound operators
        assertEquals(expectedValue, actualValue);
    }
}