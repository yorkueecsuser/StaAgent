import org.junit.Test;
import static org.junit.Assert.*;

public class OverwrittenIncrementTest {

    @Test
    public void testIncrement() {
        int i = 0;
        i = i++;
        // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        assertEquals(1, i);
    }

    @Test
    public void testDecrement() {
        int i = 1;
        i = i--;
        // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        assertEquals(0, i);
    }
}