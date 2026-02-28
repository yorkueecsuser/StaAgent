import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    // TRIGGER BUG: OptionalOfRedundantMethod
    public void testShowBug() {
        BugExample be = new BugExample();
        assertEquals("Hello", be.showBug());
    }
}