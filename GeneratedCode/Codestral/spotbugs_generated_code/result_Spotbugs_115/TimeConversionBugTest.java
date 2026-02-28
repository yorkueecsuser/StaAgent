import org.junit.Test;
import static org.junit.Assert.*;

public class TimeConversionBugTest {

    @Test
    public void testShowBug() {
        TimeConversionBug bugDemo = new TimeConversionBug();
        bugDemo.showBug(); // TRIGGER BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    }
}