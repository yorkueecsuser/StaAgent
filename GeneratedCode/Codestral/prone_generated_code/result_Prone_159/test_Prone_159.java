import org.junit.Test;
import static org.junit.Assert.*;

public class TemporalAccessorBugTest {
    @Test
    public void testShowBug() {
        TemporalAccessorBug bug = new TemporalAccessorBug();
        assertNotNull(bug.showBug());  // TRIGGER BUG: TemporalAccessorGetChronoField
    }
}