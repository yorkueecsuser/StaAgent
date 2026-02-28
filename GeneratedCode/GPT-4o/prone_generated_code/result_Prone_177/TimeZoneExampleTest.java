import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class TimeZoneExampleTest {

    @Test
    public void testShowBug() {
        TimeZoneExample example = new TimeZoneExample();
        ZonedDateTime result = example.showBug(); // TRIGGER BUG: ZoneIdOfZ

        // This assertion is designed to fail to demonstrate the bug
        assertEquals("Expected ZoneOffset.UTC, got ZoneId.of(\"Z\")", ZonedDateTime.now(ZoneOffset.UTC).getOffset(), result.getOffset()); // TRIGGER BUG: ZoneIdOfZ
    }
}