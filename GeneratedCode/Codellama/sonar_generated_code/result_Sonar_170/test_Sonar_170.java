import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    @Test
    public void testFinalizeBug() {
        FinalizeBug buggyClass = new FinalizeBug();
        
        // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
        buggyClass.showBug();
    }
}