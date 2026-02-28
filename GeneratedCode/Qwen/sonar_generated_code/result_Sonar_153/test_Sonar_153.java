import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugTest {

    @Test
    public void testCustomSerialization() {
        SerializationBug bug = new SerializationBug(10);
        bug.showBug(); // TRIGGER BUG: Custom serialization methods should have required signatures
    }
}