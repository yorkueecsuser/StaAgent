import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateValueBug {
    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year
        return d;
    }
public Calendar showBug2() {
    Calendar c = new GregorianCalendar(2014 , 12 , 25);
    c = new GregorianCalendar(2014 , 12 , 25);
    if(c.get(Calendar.MONTH)== 12){ return c; }
    return null;
}
}