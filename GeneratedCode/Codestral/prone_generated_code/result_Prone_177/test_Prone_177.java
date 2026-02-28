import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneIdBugTest {
    @Test
    public void testShowBug() {
        ZoneIdBug bug = new ZoneIdBug();
        ZonedDateTime expectedDateTime = ZonedDateTime.now(ZoneOffset.UTC);
        assertEquals(expectedDateTime, bug.showBug());  // TRIGGER BUG: ZoneIdOfZ
    }
}