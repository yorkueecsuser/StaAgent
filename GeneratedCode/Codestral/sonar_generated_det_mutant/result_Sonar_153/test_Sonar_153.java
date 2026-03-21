import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class CustomSerializationBugTest {
    @Test
    public void testShowBug() throws IOException, ClassNotFoundException {
        CustomSerializationBug buggyObject = new CustomSerializationBug();
        buggyObject.showBug(10);
        // TRIGGER BUG: Custom serialization methods should have required signatures
        // The bug is triggered when the custom serialization methods (writeObject and readObject)
        // are not correctly defined with the required signatures.
        // In this test case, the bug is triggered when the showBug method tries to serialize
        // and deserialize the buggyObject.
    }
}