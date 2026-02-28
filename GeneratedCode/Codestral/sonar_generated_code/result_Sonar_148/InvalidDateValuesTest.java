import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;

public class InvalidDateValuesTest {

    @Test
    public void testShowBug1() {
        InvalidDateValues idv = new InvalidDateValues();
        int month = idv.showBug1().getMonth(); // TRIGGER BUG: Invalid "Date" values should not be used
        assertNotEquals(12, month); // Fails if month is 12, triggering the bug
    }

    @Test
    public void testShowBug2() {
        InvalidDateValues idv = new InvalidDateValues();
        int month = idv.showBug2(); // TRIGGER BUG: Invalid "Date" values should not be used
        assertNotEquals(12, month); // Fails if month is 12, triggering the bug
    }
}