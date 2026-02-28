import org.junit.Test;
import java.io.*;
import static org.junit.Assert.*;

public class BuzzTest {

    @Test
    public void testNonSerializableClass() throws IOException, ClassNotFoundException {
        Buzz buzz = new Buzz();
        buzz.setStream(new FileInputStream("test.txt"));

        // Serialize the object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(buzz);

        // Attempt to deserialize the object - this should trigger the bug
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Buzz deserializedBuzz =  (Buzz) ois.readObject(); // BUG: NonSerializableClass // TRIGGER BUG: NonSerializableClass

        // Non-SerializableClass rule should fail
        assertNotEquals(buzz, deserializedBuzz);
    }
}