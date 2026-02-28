import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testDoRangeCheck() {
        Main main = new Main();
        int result = main.doRangeCheck(12); // the bug triggers here
        assertEquals(12, result); // TRIGGER BUG: Min and max used in combination should not always return the same value
    }
}