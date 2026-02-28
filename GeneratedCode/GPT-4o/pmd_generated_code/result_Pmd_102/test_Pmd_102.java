import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.time.LocalDateTime;

public class DateExampleTest {

    @Test
    public void testShowBug1() {
        DateExample dateExample = new DateExample();
        Date date = dateExample.showBug1(); // TRIGGER BUG: AvoidCalendarDateCreation
        assertNull("Expected showBug1 to return null due to inefficient Calendar creation", date);
    }

    @Test
    public void testShowBug2() {
        DateExample dateExample = new DateExample();
        long timeInMillis = dateExample.showBug2(); // TRIGGER BUG: AvoidCalendarDateCreation
        assertEquals("Expected showBug2 to return 0 due to inefficient Calendar creation", 0, timeInMillis);
    }

    @Test
    public void testGoodExample1() {
        DateExample dateExample = new DateExample();
        Date date = dateExample.goodExample1();
        assertNotNull("Expected goodExample1 to return a valid Date object", date);
    }

    @Test
    public void testGoodExample2() {
        DateExample dateExample = new DateExample();
        LocalDateTime localDateTime = dateExample.goodExample2();
        assertNotNull("Expected goodExample2 to return a valid LocalDateTime object", localDateTime);
    }

    @Test
    public void testGoodExample3() {
        DateExample dateExample = new DateExample();
        long timeInMillis = dateExample.goodExample3();
        assertTrue("Expected goodExample3 to return a positive long value", timeInMillis > 0);
    }
}