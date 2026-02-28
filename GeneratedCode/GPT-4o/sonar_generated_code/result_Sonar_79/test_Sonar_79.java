import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileCompoundOperatorBugTest {

    @Test
    public void testIncrementCount() {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        int initialCount = bugDemo.showBug1();
        assertEquals(initialCount + 1, bugDemo.showBug1()); // TRIGGER BUG: "volatile" variables should not be used with compound operators
    }

    @Test
    public void testToggleBoo() {
        VolatileCompoundOperatorBug bugDemo = new VolatileCompoundOperatorBug();
        boolean initialBoo = bugDemo.showBug2();
        assertNotEquals(initialBoo, bugDemo.showBug2()); // TRIGGER BUG: "volatile" variables should not be used with compound operators
    }
}