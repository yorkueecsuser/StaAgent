import org.junit.Test;
import static org.junit.Assert.*;

public class LossyPrimitiveCompareTest {
    @Test
    public void testLossyPrimitiveCompare() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        assertEquals(1, result); // TRIGGER BUG: LossyPrimitiveCompare
    }

    @Test
    public void testShowBug() {
        int result = LossyPrimitiveCompare.showBug();
        assertEquals(1, result); // TRIGGER BUG: LossyPrimitiveCompare
    }
}