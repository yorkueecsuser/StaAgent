import org.junit.Test;
import static org.junit.Assert.*;

public class ProtocolBufferOrdinalTest {

    @Test
    public void showBugTest() {
        ProtocolBufferOrdinal pbo = new ProtocolBufferOrdinal();
        // TRIGGER BUG: ProtocolBufferOrdinal
        // The bug is triggered when using ordinal() instead of getNumber() to get the tag number of a protocol buffer enum
        // Since the ordinal() value can change if the enum order changes, using it to get the tag number is not recommended
        assertEquals(1, pbo.showBug(TestEnum.VALUE2)); // Using ordinal() instead of getNumber()
    }
}