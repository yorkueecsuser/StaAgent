import org.junit.Test;
import static org.junit.Assert.*;

public class DurationBugExampleTest {

    @Test
    public void testShowBugTriggersException() {
        DurationBugExample example = new DurationBugExample();
        assertEquals("Duration between date-time values must have the same chronology", example.showBug()); // TRIGGER BUG: DurationTemporalUnit
    }
}