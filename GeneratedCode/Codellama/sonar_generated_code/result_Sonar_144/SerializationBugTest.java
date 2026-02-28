import org.junit.Test;
import static org.junit.Assert.*;

public class SerializationBugTest {
    @Test
    public void testWriteObject() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            oos.writeObject(new NonSerializableClass()); // TRIGGER BUG: "writeObject" argument must implement "Serializable"
            oos.close();
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("writeObject"));
        }
    }
}