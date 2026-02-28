import org.junit.Test;
import static org.junit.Assert.*;

public class NonSerializableClassBugTest {

    @Test
    public void testShowBug() throws Exception {
        NonSerializableClassBug buggyObject = new NonSerializableClassBug();
        buggyObject.showBug(); // TRIGGER BUG: NonSerializableClass
    }
}