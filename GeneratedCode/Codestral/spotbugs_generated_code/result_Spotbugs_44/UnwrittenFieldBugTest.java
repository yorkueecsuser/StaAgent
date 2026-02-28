import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldBugTest {
    @Test
    public void testShowBug() {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug(); // TRIGGER BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }
}