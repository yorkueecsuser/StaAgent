import org.junit.Test;
import static org.junit.Assert.*;

class RV_01_TO_INT_BugTest {

    @Test
    public void testShowBug() {
        RV_01_TO_INT_Bug bug = new RV_01_TO_INT_Bug();
        int randomValue = bug.showBug(); // TRIGGER BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        assertNotEquals(0, randomValue);
    }
}