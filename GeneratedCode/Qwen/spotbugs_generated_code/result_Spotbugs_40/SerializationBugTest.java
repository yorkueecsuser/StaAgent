import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugTest {

    @Test
    public void testReadResolveStaticMethod() {
        SerializationBug bugInstance = new SerializationBug("Test Data");
        String result = bugInstance.showBug(); // TRIGGER BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        assertEquals("Resolved Data", result); // This assertion will fail due to the bug
    }
}