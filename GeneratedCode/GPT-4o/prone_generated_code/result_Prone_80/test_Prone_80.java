import org.junit.Test;
import static org.junit.Assert.*;

public class InstantTemporalUnitExampleTest {

    @Test
    public void testShowBug() {
        InstantTemporalUnitExample example = new InstantTemporalUnitExample();
        example.showBug(); // TRIGGER BUG: InstantTemporalUnit
    }
}