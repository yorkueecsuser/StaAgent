import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYearTest {
    @Test
    public void testShowBug() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String formattedDate = sdf.format(date);
        assertEquals("2015-12-29", formattedDate); // TRIGGER BUG: MisusedWeekYear
    }
}