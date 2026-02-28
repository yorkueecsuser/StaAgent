import org.junit.Test;
import static org.junit.Assert.*;

public class RandomValueBugTest {

    @Test
    public void testShowBugFails() {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug(); // TRIGGER BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        assertEquals(1, result); // This will fail because the result is always 0 due to the bug
    }
}