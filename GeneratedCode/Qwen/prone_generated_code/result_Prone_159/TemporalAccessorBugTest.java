import org.junit.Test;
import static org.junit.Assert.*;

public class TemporalAccessorBugTest {

    @Test
    public void testShowBug() {
        TemporalAccessorBug bugDemo = new TemporalAccessorBug();
        // TRIGGER BUG: TemporalAccessorGetChronoField
        bugDemo.showBug(); // This line triggers the bug
    }
}