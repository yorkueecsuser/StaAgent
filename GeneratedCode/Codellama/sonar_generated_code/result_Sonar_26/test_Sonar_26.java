import org.junit.Test;
import static org.junit.Assert.*;

public class RecordTest {
    @Test
    public void testBug() throws Exception {
        Record record = new Record();
        record.showBug();
        // TRIGGER BUG: Members ignored during record serialization should not be used
        assertTrue(record.writeObject(new ObjectOutputStream(new ByteArrayOutputStream())));
    }
}