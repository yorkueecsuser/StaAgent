import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class DateTimeExampleTest {

    @Test
    public void testShowBugTriggersJodaToSelf() {
        DateTimeExample example = new DateTimeExample();
        Date now = new Date();
        Date result = example.showBug(now); // TRIGGER BUG: JodaToSelf
        assertEquals("The result should be the same as the input", now, result);
        fail("This test is expected to fail due to the unnecessary assignment in showBug method"); // This line ensures the test fails
    }
}