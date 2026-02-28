import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testBuggyMethod() {
        BuggyClass buggyInstance = new BuggyClass();
        buggyInstance.put("key1", "value1");
        buggyInstance.put("key2", "value2");
        assertEquals("value1", buggyInstance.get("key1"));
        assertEquals("value2", buggyInstance.get("key2"));
        // TRIGGER BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    }
}