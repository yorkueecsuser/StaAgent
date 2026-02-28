import org.junit.Test;
import static org.junit.Assert.*;

public class TryFailThrowableBugTest {
    @Test
    public void testShowBug() {
        TryFailThrowableBug buggyClass = new TryFailThrowableBug();
        boolean result = buggyClass.showBug(-1);
        assertFalse(result); // TRIGGER BUG: TryFailThrowable
    }
}