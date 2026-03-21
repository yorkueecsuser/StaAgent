import org.junit.Test;
import static org.junit.Assert.*;

public class RecordTest {
    @Test
    // TRIGGER BUG: Members ignored during record serialization should not be used
    public void testShowBug() throws Exception {
        Record record = new Record("");
        record.showBug();
    }
}