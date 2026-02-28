import org.junit.Test;
import static org.junit.Assert.*;

public class TemporalAccessorBugDemoTest {

    @Test
    public void testShowBug() {
        TemporalAccessorBugDemo demo = new TemporalAccessorBugDemo();
        String result = demo.showBug(); // TRIGGER BUG: TemporalAccessorGetChronoField
        assertEquals("Caught Exception: java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: Year", result);
    }
}