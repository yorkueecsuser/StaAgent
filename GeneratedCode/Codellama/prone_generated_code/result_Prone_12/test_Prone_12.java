import org.junit.Test;
import static org.junit.Assert.*;

public class BadShiftAmountTest {
    @Test
    public void testBug() {
        BadShiftAmount badShiftAmount = new BadShiftAmount();
        int x = 100;
        int y = 32;
        int z = x << y;
        System.out.println(z);
        assertEquals(z, 1600);
    }
}