import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugExampleTest {

    @Test
    public void testShowBugFailsDueToNonPrivateMethods() {
        SerializationBugExample example = new SerializationBugExample("Original Data");
        assertEquals("Original Data", example.getData()); // Initial check

        String result = example.showBug(); // TRIGGER BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        assertNull(result); // Expecting null due to failed custom serialization/deserialization
    }
}