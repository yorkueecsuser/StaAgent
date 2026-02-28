import org.junit.Test;
import static org.junit.Assert.*;

public class ProtocolBufferEnumExampleTest {

    @Test
    public void testShowBugWithUnknownStatus() {
        ProtocolBufferEnumExample example = new ProtocolBufferEnumExample();
        int result = example.showBug(ProtocolBufferEnumExample.Status.UNKNOWN); // TRIGGER BUG: ProtocolBufferOrdinal
        assertEquals(0, result); // The test should pass since ordinal() and getNumber() are both 0 for UNKNOWN
    }

    @Test
    public void testShowBugWithStartedStatus() {
        ProtocolBufferEnumExample example = new ProtocolBufferEnumExample();
        int result = example.showBug(ProtocolBufferEnumExample.Status.STARTED); // TRIGGER BUG: ProtocolBufferOrdinal
        assertEquals(1, result); // The test should pass since ordinal() and getNumber() are both 1 for STARTED
    }
    
    @Test
    public void testShowBugWithInProgressStatus() {
        ProtocolBufferEnumExample example = new ProtocolBufferEnumExample();
        int result = example.showBug(ProtocolBufferEnumExample.Status.IN_PROGRESS); // TRIGGER BUG: ProtocolBufferOrdinal
        assertEquals(2, result); // The test will fail since ordinal() may not equal getNumber() if enum order changes
    }

    @Test
    public void testShowBugWithCompletedStatus() {
        ProtocolBufferEnumExample example = new ProtocolBufferEnumExample();
        int result = example.showBug(ProtocolBufferEnumExample.Status.COMPLETED); // TRIGGER BUG: ProtocolBufferOrdinal
        assertEquals(3, result); // The test will fail if enum order changes affecting ordinal() but not getNumber()
    }
}