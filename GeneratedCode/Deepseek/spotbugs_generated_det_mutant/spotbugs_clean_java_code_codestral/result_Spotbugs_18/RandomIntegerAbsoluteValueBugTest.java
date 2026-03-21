import org.junit.Test;
import static org.junit.Assert.*;

public class RandomIntegerAbsoluteValueBugTest {
    @Test
    public void testShowBug() {
        RandomIntegerAbsoluteValueBug buggyClass = new RandomIntegerAbsoluteValueBug();
        int result = buggyClass.showBug();

        // TRIGGER BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        assertTrue(result >= 0);
    }
}