import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        int target = -5;
        int num = 3;

        target =- num;  // TRIGGER BUG: Non-existent operators like "=+" should not be used
        target =+ num; // TRIGGER BUG: Non-existent operators like "=+" should not be used

        assertEquals(3, Main.showBug());
    }
}