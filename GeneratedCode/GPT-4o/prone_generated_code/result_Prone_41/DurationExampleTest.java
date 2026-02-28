import org.junit.Test;
import static org.junit.Assert.*;

public class DurationExampleTest {

    @Test
    public void testShowBug() {
        DurationExample example = new DurationExample();
        long result = example.showBug(); // TRIGGER BUG: DurationGetTemporalUnit
        assertEquals("Expected -1 due to exception handling", -1, result);
    }
}