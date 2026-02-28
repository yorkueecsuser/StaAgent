import org.junit.Test;
import static org.junit.Assert.*;

public class RecordTest {
    @Test
    public void testWriteObject() {
        Record record = new Record();
        ObjectOutputStream out = new ObjectOutputStream(new ByteArrayOutputStream());
        try {
            record.writeObject(out);
            fail("Expected test to fail");
        } catch (IOException e) {
            assertEquals("writeObject method called", e.getMessage());
        }
    }

    @Test
    public void testReadObject() {
        Record record = new Record();
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            record.readObject(in);
            fail("Expected test to fail");
        } catch (IOException e) {
            assertEquals("readObject method called", e.getMessage());
        }
    }
}