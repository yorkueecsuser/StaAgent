import org.junit.Test;
import static org.junit.Assert.*;

public class InstantTemporalUnitBugTest {

    @Test
    public void testShowBug() {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        bugDemo.showBug(); // TRIGGER BUG: InstantTemporalUnit
    }
}