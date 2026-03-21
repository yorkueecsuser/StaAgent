import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testGetHeaderField() {
        String dateString = BuggyCode.getHeaderField("date");
        dateString.trim(); // TRIGGER BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        assertEquals("2023-02-28T15:30:00Z", dateString);
    }
}