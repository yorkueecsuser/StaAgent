import org.junit.Test;
import static org.junit.Assert.*;
import java.time.Month;
import java.time.DateTimeException;

public class FromTemporalAccessorBugTest {

    @Test(expected = DateTimeException.class)
    public void testShowBug() {
        FromTemporalAccessorBug buggyCode = new FromTemporalAccessorBug();
        Month month = Month.JANUARY;
        // TRIGGER BUG: FromTemporalAccessor
        buggyCode.showBug(month);
    }
}