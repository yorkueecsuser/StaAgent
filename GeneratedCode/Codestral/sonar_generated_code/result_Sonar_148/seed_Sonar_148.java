import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateValues {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used
        return d;
    }

    public int showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used
        return c.get(Calendar.MONTH);  // BUG: Invalid comparison
    }

    public static void main(String[] args) {
        InvalidDateValues idv = new InvalidDateValues();
        System.out.println(idv.showBug1());
        System.out.println(idv.showBug2());
    }
}