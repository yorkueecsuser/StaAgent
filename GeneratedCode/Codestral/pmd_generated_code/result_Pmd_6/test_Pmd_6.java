import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    @Test
    public void testShowBug() {
        FinalizeBug bugObject = new FinalizeBug();
        bugObject.showBug(); // TRIGGER BUG: AvoidCallingFinalize
    }
}