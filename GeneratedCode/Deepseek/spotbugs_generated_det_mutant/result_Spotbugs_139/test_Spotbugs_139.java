import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        Main.showBug();
    }
}