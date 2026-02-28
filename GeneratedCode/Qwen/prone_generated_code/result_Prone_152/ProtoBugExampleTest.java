import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBugExampleTest {

    @Test
    public void testSetUnrecognized() {
        ProtoBugExample example = new ProtoBugExample();
        assertEquals("Field set to UNRECOGNIZED value", example.showBug()); // TRIGGER BUG: SetUnrecognized
    }
}