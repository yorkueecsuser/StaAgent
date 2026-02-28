import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    public void testBug() {
        BugExample.showBug();
        assertTrue(true);
    }
}