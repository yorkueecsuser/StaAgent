import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class ProtocolBufferOrdinalBugTest {

    @Test
    public void testShowBug() {
        ProtocolBufferOrdinalBug bugDemo = new ProtocolBufferOrdinalBug();
        Map<String, Integer> result = bugDemo.showBug();

        // TRIGGER BUG: ProtocolBufferOrdinal
        assertEquals(Integer.valueOf(0), result.get("UNKNOWN"));
        assertEquals(Integer.valueOf(1), result.get("VALUE1"));
        assertEquals(Integer.valueOf(2), result.get("VALUE2"));
    }
}