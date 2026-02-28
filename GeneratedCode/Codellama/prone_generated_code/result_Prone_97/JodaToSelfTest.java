import org.junit.Test;
import static org.junit.Assert.*;

public class JodaToSelfTest {
    @Test
    public void testShowBug() {
        JodaToSelf jodaToSelf = new JodaToSelf();
        jodaToSelf.showBug();
        // TRIGGER BUG: JodaToSelf
        assertEquals(1001, newDuration.toNanos());
        // TRIGGER BUG: JodaToSelf
        assertEquals(1001, newInstant.toEpochMilli());
        // TRIGGER BUG: JodaToSelf
        assertEquals(2, newPeriod.toDays());
    }
}