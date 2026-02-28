import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class SerializationBugTest {

    @Test
    public void testSerializationBug() throws IOException, ClassNotFoundException {
        SerializationBug bug = new SerializationBug("hello world");
        SerializationBug buggyObject = bug.showBug(); // TRIGGER BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        assertNotEquals(bug.toString(), buggyObject.toString()); // Fix Compiler Error by calling toString()
    }
}