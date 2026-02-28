import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testSetName() {
        BugExample bugExample = new BugExample();
        bugExample.setName("John Doe"); // TRIGGER BUG: Variables should not be self-assigned
        assertEquals("John Doe", bugExample.getName()); // This test will fail
    }
}