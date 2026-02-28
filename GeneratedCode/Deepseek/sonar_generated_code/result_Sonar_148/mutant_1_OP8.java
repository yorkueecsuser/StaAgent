import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    // BUG: Invalid "Date" values should not be used
    public Date showBug1() {
        Date date = new Date();
        date.setDate(25);
        date.setYear(2014);
        date.setMonth(12);  // Noncompliant; rolls date into the next year
        return date;
    }

    // BUG: Invalid "Date" values should not be used
    public Calendar showBug2() {
        Calendar cal = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        return cal;
    }

    public static void main(String[] args) {
        DateBugExample bugExample = new DateBugExample();
        Date bug1 = bugExample.showBug1();
        Calendar bug2 = bugExample.showBug2();
        
        System.out.println("Bug 1 Date: " + bug1);
        System.out.println("Bug 2 Calendar: " + bug2.getTime());
    }
}