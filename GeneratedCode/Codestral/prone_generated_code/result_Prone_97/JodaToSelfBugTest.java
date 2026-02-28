import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class JodaToSelfBugTest {
    @Test
    public void testShowBug() {
        JodaToSelfBug buggyClass = new JodaToSelfBug();
        LocalDateTime dateTime = LocalDateTime.now();
        // TRIGGER BUG: JodaToSelf
        assertNotEquals(dateTime, buggyClass.showBug(dateTime));
    }
}