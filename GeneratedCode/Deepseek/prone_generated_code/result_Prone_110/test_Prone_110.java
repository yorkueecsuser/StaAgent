import org.junit.Test;
import static org.junit.Assert.*;

public class MisusedWeekYearTest {
    @Test
    // TRIGGER BUG: MisusedWeekYear
    public void testShowBug() {
        MisusedWeekYear misusedWeekYear = new MisusedWeekYear();
        misusedWeekYear.showBug(); // BUG: MisusedWeekYear
    }
}