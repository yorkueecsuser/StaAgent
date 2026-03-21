import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        int original = 10;
        int expected = original;
        int actual = Main.showBug();
        // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        assertEquals(expected, actual);
    }
}