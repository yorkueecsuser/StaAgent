import org.junit.Test;
import static org.junit.Assert.*;

public class BitAndZzTest {

    @Test
    public void testShowBug() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result & 0; // TRIGGER BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        }
        assertEquals(result, 0);
    }
}