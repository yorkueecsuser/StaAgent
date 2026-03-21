import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.UnsupportedTemporalTypeException;

public class BugTemporalAccessorGetChronoFieldTest {

    private BugTemporalAccessorGetChronoField bugTemporalAccessorGetChronoField = new BugTemporalAccessorGetChronoField();

    @Test // TRIGGER BUG: TemporalAccessorGetChronoField
    public void testShowBug1() {
        try {
            bugTemporalAccessorGetChronoField.showBug1();
            fail("Expected UnsupportedTemporalTypeException");
        } catch (UnsupportedTemporalTypeException e) {
            // Expected
        }
    }

    @Test // TRIGGER BUG: TemporalAccessorGetChronoField
    public void testShowBug2() {
        try {
            bugTemporalAccessorGetChronoField.showBug2();
            fail("Expected UnsupportedTemporalTypeException");
        } catch (UnsupportedTemporalTypeException e) {
            // Expected
        }
    }
}