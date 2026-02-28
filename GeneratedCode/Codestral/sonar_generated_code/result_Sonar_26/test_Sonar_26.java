import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class BuggyRecordTest {
    @Test
    public void testBug() throws IOException, ClassNotFoundException {
        BuggyRecord record = new BuggyRecord();
        record.showBug(); // TRIGGER BUG: Members ignored during record serialization should not be used
        fail("The test should have thrown an IOException");
    }
}