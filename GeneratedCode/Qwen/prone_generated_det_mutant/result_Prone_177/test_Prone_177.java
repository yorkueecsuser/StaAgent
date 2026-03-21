import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZonedDateTime;

public class ZoneIdExampleTest {

    @Test
    public void testShowBug() {
        ZoneIdExample example = new ZoneIdExample();
        ZonedDateTime result = example.showBug(); // TRIGGER BUG: ZoneIdOfZ
        assertNotNull(result); // This assertion will pass, but the bug is still present in the code
    }
}