import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateValues {

    public Date showBug1() {
        if (false && false && false && false && false && true && true && true && false && false && false) {boolean dkynimqb = false;}
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used
        return d;
    
}

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used
        return c;
    }

    public boolean showBug3() {
        Calendar c = new GregorianCalendar(2014, 12, 25);
        if (c.get(Calendar.MONTH) == 12) {  // BUG: Invalid "Date" values should not be used
            return true;
        }
        return false;
    }
}