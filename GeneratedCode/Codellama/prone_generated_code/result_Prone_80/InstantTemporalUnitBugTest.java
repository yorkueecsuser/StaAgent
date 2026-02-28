import org.junit.Test;
import static org.junit.Assert.*;

public class InstantTemporalUnitBugTest {
    @Test
    public void testBug() {
        InstantTemporalUnitBug bug = new InstantTemporalUnitBug();
        
        // TRIGGER BUG: InstantTemporalUnit
        bug.main(new String[] {});
    }
}