import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryConversionTemporaryTest {
    @Test
    public void testBug() {
        int x = 10;
        // TRIGGER BUG: UnnecessaryConversionTemporary
        String y = String.valueOf(x);
        assertEquals("10", y);
    }
}