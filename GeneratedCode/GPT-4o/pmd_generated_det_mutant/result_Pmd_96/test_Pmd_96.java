import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class DateFormatterExampleTest {

    @Test
    public void testShowBug() {
        DateFormatterExample example = new DateFormatterExample();
        Date date = new Date(0);

        // TRIGGER BUG: UnsynchronizedStaticFormatter
        String result1 = example.showBug(date);

        // TRIGGER BUG: UnsynchronizedStaticFormatter
        String result2 = example.showBug(date);

        // The test will fail if the results are not equal due to unsynchronized access
        assertEquals(result1, result2);
    }
}