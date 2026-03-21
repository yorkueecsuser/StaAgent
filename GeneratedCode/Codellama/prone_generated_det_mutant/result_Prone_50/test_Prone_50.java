import org.junit.Test;
import static org.junit.Assert.*;

public class FloggerLogStringTest {
    @Test
    public void testFloggerLogString() {
        FloggerLogString floggerLogString = new FloggerLogString();
        // TRIGGER BUG: FloggerLogString
        floggerLogString.showBug();
    }
}