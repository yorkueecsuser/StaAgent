import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    final Main main = new Main();

    @Test
    // TRIGGER BUG: Synchronization should not be done on instances of value-based classes
    public void testSyncMethod() {
        Runnable r1 = () -> main.syncMethod("Hello world!");
        Runnable r2 = () -> main.syncMethod("Hello world!");
        new Thread(r1).start();
        new Thread(r2).start();
    }
}