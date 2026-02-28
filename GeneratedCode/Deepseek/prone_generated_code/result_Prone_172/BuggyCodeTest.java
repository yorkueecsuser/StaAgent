import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode bc = new BuggyCode();
        bc.showBug(); // TRIGGER BUG: UnusedAnonymousClass
    }
}