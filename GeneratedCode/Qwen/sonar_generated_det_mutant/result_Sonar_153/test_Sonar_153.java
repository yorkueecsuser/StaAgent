import org.junit.Test;
import static org.junit.Assert.*;

public class CustomSerializableTest {

    @Test
    public void testCustomSerialization() {
        CustomSerializable obj = new CustomSerializable(42);
        obj.showBug(); // TRIGGER BUG: Custom serialization methods should have required signatures
    }
}