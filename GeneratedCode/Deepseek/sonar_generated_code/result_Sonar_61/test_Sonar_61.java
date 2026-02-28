import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    private BugExample bugExample = new BugExample();

    @Test
    public void testShowBug() {
        bugExample.setX(10);
        assertEquals(10, bugExample.getY()); // TRIGGER BUG: Getters and setters should access the expected fields
    }
}