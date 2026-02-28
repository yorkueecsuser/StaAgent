// TRIGGER BUG: AvoidCalendarDateCreation

import org.junit.Test;
import static org.junit.Assert.*;

class AvoidCalendarDateCreationTest {
    @Test
    public void testBug() {
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        assertNotNull(date);
    }
}