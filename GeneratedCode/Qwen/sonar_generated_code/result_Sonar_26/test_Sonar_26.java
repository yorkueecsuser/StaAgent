import org.junit.Test;
import static org.junit.Assert.*;

public class RecordExampleTest {

    @Test
    public void testNonCompliantRecord1() {
        RecordExample.NonCompliantRecord1 record1 = new RecordExample.NonCompliantRecord1();
        record1.showBug1(); // TRIGGER BUG: Members ignored during record serialization should not be used
    }

    @Test
    public void testNonCompliantRecord2() {
        RecordExample.NonCompliantRecord2 record2 = new RecordExample.NonCompliantRecord2();
        record2.showBug2(); // TRIGGER BUG: Members ignored during record serialization should not be used
    }

    @Test
    public void testCompliantRecord() {
        RecordExample.CompliantRecord record3 = new RecordExample.CompliantRecord();
        record3.showBug();
    }
}