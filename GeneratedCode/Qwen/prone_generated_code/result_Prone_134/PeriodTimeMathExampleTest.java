import org.junit.Test;
import static org.junit.Assert.*;

public class PeriodTimeMathExampleTest {

    @Test
    public void testShowBugTriggersPeriodTimeMath() {
        PeriodTimeMathExample example = new PeriodTimeMathExample();
        example.showBug(); // TRIGGER BUG: PeriodTimeMath
    }
}