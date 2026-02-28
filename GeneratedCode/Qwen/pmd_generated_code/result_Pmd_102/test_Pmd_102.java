import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class DateStuffTest {

    @Test
    public void testShowBug1() {
        DateStuff dateStuff = new DateStuff();
        Date result = dateStuff.showBug1(); // TRIGGER BUG: AvoidCalendarDateCreation
        assertNotNull(result);
    }

    @Test
    public void testShowBug2() {
        DateStuff dateStuff = new DateStuff();
        long result = dateStuff.showBug2(); // TRIGGER BUG: AvoidCalendarDateCreation
        assertTrue(result > 0);
    }
}