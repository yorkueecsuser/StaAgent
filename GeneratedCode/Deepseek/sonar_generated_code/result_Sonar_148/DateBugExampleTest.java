import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateBugExampleTest {

    @Test 
    public void testShowBug1() {
        DateBugExample bugExample = new DateBugExample();
        Date bug1 = bugExample.showBug1();
        assertEquals(11, bug1.getMonth()); 
    }

    @Test 
    public void testShowBug2() {
        DateBugExample bugExample = new DateBugExample();
        Calendar bug2 = bugExample.showBug2();
        assertEquals(11, bug2.get(Calendar.MONTH)); 
    }
}