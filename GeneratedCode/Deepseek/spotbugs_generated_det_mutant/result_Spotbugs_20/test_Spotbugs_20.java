import org.junit.Test;
import static org.junit.Assert.*;

public class RandomBugTest {
    RandomBug randomBug = new RandomBug();

    @Test
    public void testShowBug() {
        int result = randomBug.showBug();
        assertNotEquals(0, result); // TRIGGER BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    }
}