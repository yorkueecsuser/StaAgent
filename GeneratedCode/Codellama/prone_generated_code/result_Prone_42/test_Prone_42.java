import org.junit.Test;
import static org.junit.Assert.*;

public class DurationTemporalUnitBugTest {
    @Test
    public void testBug() {
        DurationTemporalUnitBug buggy = new DurationTemporalUnitBug();
        buggy.main(null); // TRIGGER BUG: DurationTemporalUnit
    }
}