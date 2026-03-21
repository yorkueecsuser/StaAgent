import org.junit.Test;
import static org.junit.Assert.*;

public class RecordExampleTest {

    @Test
    public void testNonCompliantRecord() {
        RecordExample.NonCompliantRecord nonCompliantRecord = new RecordExample.NonCompliantRecord();
        nonCompliantRecord.showBug(); // TRIGGER BUG: Members ignored during record serialization should not be used
    }

    @Test
    public void testNonCompliantExternalRecord() {
        RecordExample.NonCompliantExternalRecord nonCompliantExternalRecord = new RecordExample.NonCompliantExternalRecord();
        nonCompliantExternalRecord.showBug(); // TRIGGER BUG: Members ignored during record serialization should not be used
    }

    @Test
    public void testCompliantRecord() {
        RecordExample.CompliantRecord compliantRecord = new RecordExample.CompliantRecord();
        compliantRecord.showBug();
    }
}