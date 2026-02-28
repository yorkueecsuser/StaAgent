import org.junit.Test;
import static org.junit.Assert.*;

public class IntShiftBugTest {

    @Test
    public void testBug() {
        IntShiftBug isb = new IntShiftBug();
        int x = 10;
        int y = x << 32;
        assertEquals(10, y);
    }
}