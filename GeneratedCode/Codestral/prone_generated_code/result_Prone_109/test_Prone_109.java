import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class MisusedDayOfYearBugTest {

    @Test
    public void testShowBug() {
        MisusedDayOfYearBug bug = new MisusedDayOfYearBug();
        Date buggyDate = bug.showBug(2022, 73); // TRIGGER BUG: MisusedDayOfYear
        assertNotNull("The date should not be null", buggyDate);
    }
}