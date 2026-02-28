import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class BugTest {
    @Test
    public void testSerialization() throws IOException, ClassNotFoundException {
        Bug bug = new Bug("test");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(bug); // TRIGGER BUG: MissingSerialVersionUID
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Bug deserializedBug = (Bug) ois.readObject();

        assertEquals("test", deserializedBug.showBug());
    }
}