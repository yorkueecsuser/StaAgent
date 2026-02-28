import org.junit.Test;
import static org.junit.Assert.*;

public class BundleDeserializationExampleTest {

    @Test
    public void testShowBugWithIncorrectType() throws Exception {
        BundleDeserializationExample example = new BundleDeserializationExample();
        // Serialize a different type of object to trigger the bug
        String input = "Sample Data";
        byte[] serialized = example.serialize(input); // Serialize a String instead of ComplexObject
        Object deserialized = example.deserialize(serialized);
        deserialized.toString(); // TRIGGER BUG: BundleDeserializationCast
    }
}