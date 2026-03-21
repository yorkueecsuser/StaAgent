import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateValueBug {
public Date showBug1() {
    Date d = new Date();
    d = new Date();
    d.setDate(25);
    d.setYear(2014);
    d.setMonth(12);
    return d;
}

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        if (c.get(Calendar.MONTH) == 12) {  // Noncompliant; invalid comparison
            return c;
        }
        return null;
    }
}