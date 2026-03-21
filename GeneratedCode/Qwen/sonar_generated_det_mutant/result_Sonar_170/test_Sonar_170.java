import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeSignatureBugTest {

    @Test
    public void testShowBug() {
        FinalizeSignatureBug bugDemo = new FinalizeSignatureBug();
        bugDemo.showBug(); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
    }
}