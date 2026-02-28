import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class NonSerializableClassTest {
    @Test
    public void testNonSerializableClass() throws IOException, ClassNotFoundException {
        // Create a NonSerializableClass object
        NonSerializableClass nsc = new NonSerializableClass(10);

        // Serialize the object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(nsc);
        oos.close();

        // Deserialize the object
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        try {
            NonSerializableClass nsc2 = (NonSerializableClass) ois.readObject();
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // TODO: Add assertions if needed
        }
    }
}