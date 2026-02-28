import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    // BUG: Invalid "Date" values should not be used
    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        boolean condition = false; // Unreachable condition
        if (condition) {
            d.setMonth(12);
        }
        return d;
    }

    // BUG: Invalid "Date" values should not be used
    public Calendar showBug2() {
        boolean condition = false; // Unreachable condition
        Calendar c = new GregorianCalendar(2014, 12, 25);
        if(condition){
            c = new GregorianCalendar(2014, 12, 25);
        }
        return c;
    }

    public static void main(String[] args) {
        DateBugExample bugExample = new DateBugExample();
        Date bug1 = bugExample.showBug1();
        Calendar bug2 = bugExample.showBug2();
        
        System.out.println("Bug 1 Date: " + bug1);
        System.out.println("Bug 2 Calendar: " + bug2.getTime());
    }
}