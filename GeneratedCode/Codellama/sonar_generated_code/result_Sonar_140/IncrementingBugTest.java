import org.junit.Test;
import static org.junit.Assert.*;

public class IncrementingBugTest {
    @Test
    public void testBug() {
        int i = 0;
        i = i++; // TRIGGER BUG: Values should not be uselessly incremented
        assertEquals(1, i);
    }
}