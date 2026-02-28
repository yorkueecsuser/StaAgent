import org.junit.Test;
import static org.junit.Assert.*;

public class NonExistentOperatorsBugTest {

    @Test
    public void testShowBug1() {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        assertEquals(3, bugDemo.showBug1(-5, 3)); // TRIGGER BUG: Non-existent operators like "=+" should not be used
    }

    @Test
    public void testShowBug2() {
        NonExistentOperatorsBug bugDemo = new NonExistentOperatorsBug();
        assertEquals(-3, bugDemo.showBug2(-5, 3)); // TRIGGER BUG: Non-existent operators like "=+" should not be used
    }
}