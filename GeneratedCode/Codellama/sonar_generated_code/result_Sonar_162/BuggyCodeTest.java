import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testSetName() {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.setName("John");
        // TRIGGER BUG: Variables should not be self-assigned
        buggyCode.setName("John");
        assertEquals("John", buggyCode.name);
    }
}