import org.junit.Test;
import static org.junit.Assert.*;

public class BadMonthValueTest {

    @Test
    public void testShowBug() {
        BadMonthValue bmv = new BadMonthValue();
        String result = bmv.showBug(13); // TRIGGER BUG: Passing a month value of 13, which is outside the expected range of 0..11
        assertNotEquals("Month: 12", result); // Assert that the result is not December because 13 is not a valid month
    }
}