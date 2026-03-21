import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class CustomSerializationDemoTest {

    @Test
    public void testSerializationDeserialization() {
        CustomSerializationDemo original = new CustomSerializationDemo("TestData");

        try {
            // Serialize
            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOutStream);
            out.writeObject(original);
            out.close();

            // Deserialize
            ByteArrayInputStream byteInStream = new ByteArrayInputStream(byteOutStream.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteInStream);
            CustomSerializationDemo deserialized = (CustomSerializationDemo) in.readObject();
            in.close();

            // Validate deserialized data
            assertEquals("TestData", deserialized.showBug()); // TRIGGER BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)

        } catch (IOException | ClassNotFoundException e) {
            fail("Exception during serialization/deserialization: " + e.getMessage());
        }
    }

    @Test
    public void testShowBug() {
        CustomSerializationDemo instance = new CustomSerializationDemo("AnotherTest");
        assertEquals("AnotherTest", instance.showBug());
    }
}