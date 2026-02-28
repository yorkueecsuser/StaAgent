import org.junit.Test;
import static org.junit.Assert.*;

public class NullCloseBugTest {
    @Test
    public void testShowBug() {
        NullCloseBug buggyObject = new NullCloseBug();
        buggyObject.showBug(); // TRIGGER BUG: NP: close() invoked on a value that is always null (NP_CLOSING_NULL)
    }
}