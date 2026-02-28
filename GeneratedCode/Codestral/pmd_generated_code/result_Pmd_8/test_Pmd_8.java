import org.junit.Test;
import static org.junit.Assert.*;

public class ThrowableBugTest {
    @Test
    public void testShowBug() {
        ThrowableBug buggyObject = new ThrowableBug();
        buggyObject.showBug();  // TRIGGER BUG: AvoidCatchingThrowable, expecting NullPointerException to be thrown
    }
}