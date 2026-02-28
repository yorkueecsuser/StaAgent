import org.junit.Test;
import static org.junit.Assert.*;

public class MisusedWeekYearExampleTest {

    @Test
    public void testMisusedWeekYear() {
        MisusedWeekYearExample example = new MisusedWeekYearExample();
        String formattedDate = example.showBug(); // TRIGGER BUG: MisusedWeekYear
        assertEquals("2023-12-31", formattedDate); // This will fail if today's date is in the first week of the next year
    }
}