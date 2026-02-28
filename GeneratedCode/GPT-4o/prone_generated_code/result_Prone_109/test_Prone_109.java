import org.junit.Test;
import static org.junit.Assert.*;

public class DatePatternExampleTest {

    @Test
    public void testShowBugTriggersMisusedDayOfYearBug() {
        DatePatternExample example = new DatePatternExample();
        String result = example.showBug(); // TRIGGER BUG: MisusedDayOfYear
        assertFalse("Expected misformatted date, e.g., '03-073-2023'", result.matches("\\d{2}-\\d{2}-\\d{4}"));
    }
}