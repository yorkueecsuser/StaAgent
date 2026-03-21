import org.junit.Test;
import static org.junit.Assert.*;

public class DateBugTest {
    
    DateBug db = new DateBug();

    @Test
    public void testShowBug() {
        try {
            db.showBug(); // This line triggers the bug
            // TRIGGER BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException anIllegalArgumentException) {
            assertTrue(anIllegalArgumentException.getMessage().contains("Invalid value for Month: 13"));
        }
    }
}