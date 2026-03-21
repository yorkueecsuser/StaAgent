import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class VolatileBugTest {

    @Test
    public void testBug() {
        VolatileBug vbug = new VolatileBug();
        int[] result = vbug.showBug();
        // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

    @Test
    public void testBug2() {
        VolatileBug vbug = new VolatileBug();
        VolatileBug.MyObj result = vbug.showBug2();
        result.setValue(5); // TRIGGER BUG: Non-primitive fields should not be "volatile"
        assertEquals(5, result.getValue());
    }
}