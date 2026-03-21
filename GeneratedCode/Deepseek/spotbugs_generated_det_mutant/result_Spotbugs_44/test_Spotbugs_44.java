import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main m = new Main();
        String result = m.showBug();  // This line triggers the bug
        fail("This test should fail"); // TRIGGER BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }
}