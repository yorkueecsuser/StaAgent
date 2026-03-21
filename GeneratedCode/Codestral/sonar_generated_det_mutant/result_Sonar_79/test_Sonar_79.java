import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugTest {
    @Test
    public void testShowBug() {
        VolatileBug volatileBug = new VolatileBug();
        volatileBug.showBug();
        // TRIGGER BUG: "volatile" variables should not be used with compound operators
        // The bug is triggered when multiple threads increment the volatile int count simultaneously
        // This can lead to data loss as the increment operation is not atomic
    }
}