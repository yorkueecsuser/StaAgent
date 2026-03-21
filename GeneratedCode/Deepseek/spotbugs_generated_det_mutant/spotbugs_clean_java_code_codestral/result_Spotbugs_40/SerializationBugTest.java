import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugTest {

    @Test
    public void testReadResolveMethodBug() {
        SerializationBug buggyObject = new SerializationBug();
        // TRIGGER BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
        buggyObject.showBug();
    }
}