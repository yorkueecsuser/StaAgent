import org.junit.Test;
import static org.junit.Assert.*;

public class CheckNotNullMultipleTimesTest {
    @Test
    public void testShowBug() {
        Object obj = null;
        // TRIGGER BUG: CheckNotNullMultipleTimes
        CheckNotNullMultipleTimes.showBug(obj);
        // This line should fail because obj is null
        System.out.println(obj.toString());
    }
}