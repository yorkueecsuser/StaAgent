import org.junit.Test;
import static org.junit.Assert.*;

public class DurationExampleTest {

    @Test
    public void testShowBug() {
        DurationExample example = new DurationExample();
        example.showBug(); // TRIGGER BUG: DurationTemporalUnit
    }
}