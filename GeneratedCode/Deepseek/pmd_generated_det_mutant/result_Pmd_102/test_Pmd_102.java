import org.junit.Test;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.*;

public class DateStuffTest {

    private class DateStuff {
        private Date bad1() {
            return Calendar.getInstance().getTime(); // now
        }
        private Date good1a() {
            return new Date(); // now
        }
        private LocalDateTime good1b() {
            return LocalDateTime.now();
        }
        private long bad2() {
            return Calendar.getInstance().getTimeInMillis();
        }
        private long good2() {
            return System.currentTimeMillis();
        }

        public Date showBug() {
            return bad1();
        }
    }

    DateStuff dateStuff = new DateStuff();

    @Test // TRIGGER BUG: AvoidCalendarDateCreation
    public void testBad1() {
        Date date = dateStuff.showBug();
        assertEquals(Calendar.getInstance().getTime().toString(), date.toString()); // Expecting failure, bad1() uses Calendar.
    }
}