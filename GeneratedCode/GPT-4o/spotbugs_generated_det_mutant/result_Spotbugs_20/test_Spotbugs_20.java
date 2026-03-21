import org.junit.Test;
import static org.junit.Assert.*;

public class RandomValueBugTest {

    @Test
    public void testShowBug() {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug(); // TRIGGER BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        assertEquals("The result should always be 0 due to coercion", 0, result);
    }
}