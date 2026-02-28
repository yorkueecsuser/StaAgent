import org.junit.Test;
import static org.junit.Assert.*;

public class CustomSerializationBugTest {

    @Test
    public void testCustomSerializationBug() throws Exception {
        CustomSerializationBug.showBug();
        // TRIGGER BUG: Custom serialization methods should have required signatures
        // The bug is triggered when the custom serialization methods are not public,
        // causing the JVM to fall back to the default serialization logic,
        // resulting in unexpected behavior at runtime.
    }
}