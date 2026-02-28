import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class OverridableMethodInReadObjectTest {

    @Test
    public void testShowBug() {
        OverridableMethodInReadObject obj = new OverridableMethodInReadObject(42);
        assertEquals("Demonstration of an overridable method being called from readObject.", obj.showBug());

        // Attempt to serialize and deserialize the object to trigger the bug
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            OverridableMethodInReadObject deserializedObj = (OverridableMethodInReadObject) objectInputStream.readObject(); // TRIGGER BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)

            // This assert is expected to fail due to the bug
            assertEquals("Demonstration of an overridable method being called from readObject.", deserializedObj.showBug());
        } catch (IOException | ClassNotFoundException e) {
            fail("Exception should not be thrown here.");
        }
    }
}