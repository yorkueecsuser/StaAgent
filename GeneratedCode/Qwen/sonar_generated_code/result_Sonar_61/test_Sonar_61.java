import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testSetXAndGetY() {
        BuggyClass buggy = new BuggyClass();
        buggy.setX(10); // TRIGGER BUG: Getters and setters should access the expected fields
        assertEquals(10, buggy.getY()); // TRIGGER BUG: Getters and setters should access the expected fields
    }

    @Test
    public void testShowBug() {
        BuggyClass buggy = new BuggyClass();
        assertEquals(10, buggy.showBug()); // TRIGGER BUG: Getters and setters should access the expected fields
    }
}