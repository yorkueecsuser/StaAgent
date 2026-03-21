import org.junit.Test;
import static org.junit.Assert.*;

public class RecordTest {
    @Test
    public void testShowBug() throws IOException {
        // TRIGGER BUG: Members ignored during record serialization should not be used
        new Record().showBug();
    }
}