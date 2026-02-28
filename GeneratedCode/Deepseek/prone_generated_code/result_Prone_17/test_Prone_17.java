import org.junit.Test;
import static org.junit.Assert.*;

public class CheckNotNullMultipleTimesTest {

    @Test
    public void testShowBug() {
        CheckNotNullMultipleTimes instance = new CheckNotNullMultipleTimes(null);
        // TRIGGER BUG: CheckNotNullMultipleTimes
        instance.showBug();
    }
}