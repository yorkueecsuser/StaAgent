import org.junit.Test;
import static org.junit.Assert.*;

public class CheckNotNullMultipleTimesExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        CheckNotNullMultipleTimesExample example = new CheckNotNullMultipleTimesExample();
        example.showBug(null); // TRIGGER BUG: CheckNotNullMultipleTimes
    }
}