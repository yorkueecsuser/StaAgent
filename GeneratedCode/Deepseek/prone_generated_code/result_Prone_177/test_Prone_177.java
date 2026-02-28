import org.junit.Test;
import static org.junit.Assert.*;
import java.time.*;

// TRIGGER BUG: ZoneIdOfZ
public class ZoneIdOfZTest {
    @Test
    public void testShowBug() {
        ZoneIdOfZ bug = new ZoneIdOfZ();
        // The trigger line for the bug in the showBug() method (line 8)
        // TRIGGER BUG: ZoneIdOfZ
        OffsetDateTime offsetDateTime = bug.showBug(LocalDateTime.now());
        // The trigger line for the bug in the showBug() method (line 6)
        // TRIGGER BUG: ZoneIdOfZ
        assertEquals(ZoneOffset.UTC, offsetDateTime.getOffset());
    }
}