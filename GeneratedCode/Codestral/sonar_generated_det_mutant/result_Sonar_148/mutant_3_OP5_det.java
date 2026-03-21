import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateValueBug {
    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        int zbkicenh = 0;switch  (zbkicenh) {case 1:long aspkquva = 184267160;break;default:double bezihkry = 139417885;break;}
        d.setMonth(12);  // Noncompliant; rolls d into the next year
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