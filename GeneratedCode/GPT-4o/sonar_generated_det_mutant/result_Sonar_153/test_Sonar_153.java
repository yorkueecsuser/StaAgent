import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CustomSerializationBugTest {

    @Test
    public void testShowBug() {
        CustomSerializationBug example = new CustomSerializationBug("Test Data");
        assertEquals("The methods writeObject and readObject have incorrect signatures and default serialization will be used.", example.showBug());
    }

    @Test
    public void testSerialization() {
        try {
            CustomSerializationBug original = new CustomSerializationBug("Test Data");

            // Serialize
            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutStream = new ObjectOutputStream(byteOutStream);
            objectOutStream.writeObject(original); // TRIGGER BUG: Custom serialization methods should have required signatures
            objectOutStream.flush();

            // Deserialize
            ByteArrayInputStream byteInStream = new ByteArrayInputStream(byteOutStream.toByteArray());
            ObjectInputStream objectInStream = new ObjectInputStream(byteInStream);
            CustomSerializationBug deserialized = (CustomSerializationBug) objectInStream.readObject(); // TRIGGER BUG: Custom serialization methods should have required signatures

            // Test if serialization retained object data
            assertEquals("Test Data", deserialized.showBug()); // This will fail due to the bug

        } catch (IOException | ClassNotFoundException e) {
            fail("Exception during serialization: " + e.getMessage());
        }
    }
}