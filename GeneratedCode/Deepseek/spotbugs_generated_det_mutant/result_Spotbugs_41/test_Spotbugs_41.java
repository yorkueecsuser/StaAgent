import org.junit.Test;
import static org.junit.Assert.*;

public class SerializableBugTest {

    @Test
    public void testShowBug() {
        SerializableBug bug = new SerializableBug();
        bug.showBug(); // TRIGGER BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
    }
}