import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MisusedDayOfYearTest {
    private MisusedDayOfYear bug = new MisusedDayOfYear();

    @Test
    // TRIGGER BUG: MisusedDayOfYear
    public void testShowBug() {
        String result = bug.showBug(); // BUG: MisusedDayOfYear
        assertNotEquals("MM-DD-yyyy", result); // Expecting the result not to match the "MM-DD-yyyy" format
    }

    class MisusedDayOfYear {
        public String showBug() {
            SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
            return sdf.format(new Date());
        }
    }
}