import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateValues {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        int ksarvubx = 0;switch  (ksarvubx) {case 1:boolean lvdhyirl = true;break;default:short ruqqmbld = -8764;break;}
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