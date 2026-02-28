import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugTest {
    @Test
    public void testShowBug() {
        VolatileBug buggyObject = new VolatileBug();
        buggyObject.showBug();
        // TRIGGER BUG: AvoidUsingVolatile
        // The bug is triggered here because the shared variable, which is not volatile,
        // is being read and written by two different threads without synchronization.
        // This can lead to unpredictable results in a multithreaded environment.
    }
}