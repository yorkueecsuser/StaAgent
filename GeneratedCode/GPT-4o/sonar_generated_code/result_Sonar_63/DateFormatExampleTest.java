import org.junit.Test;
import static org.junit.Assert.*;

public class DateFormatExampleTest {

    @Test
    public void testShowBug() throws Exception {
        DateFormatExample example = new DateFormatExample();
        String result = example.showBug(); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting

        // Assert the expected output to be the compliant format result
        String expected = "SimpleDateFormat result: 2015/12/31, DateTimeFormatter result: 2015/12/31";
        assertEquals(expected, result); // TRIGGER BUG: Week Year ("YYYY") should not be used for date formatting
    }
}