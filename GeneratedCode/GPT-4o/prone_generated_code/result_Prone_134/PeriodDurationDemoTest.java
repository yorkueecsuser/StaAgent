import org.junit.Test;
import static org.junit.Assert.*;

public class PeriodDurationDemoTest {

    @Test
    public void testShowBug_TriggerPeriodTimeMath() {
        PeriodDurationDemo demo = new PeriodDurationDemo();
        demo.showBug(); // TRIGGER BUG: PeriodTimeMath
    }
}