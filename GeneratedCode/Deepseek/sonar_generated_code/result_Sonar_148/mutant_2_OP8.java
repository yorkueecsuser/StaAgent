import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    // BUG: Invalid "Date" values should not be used
    public Date showBug1() {
        Date mutantDate = new Date();
        mutantDate.setDate(25);
        mutantDate.setYear(2014);
        mutantDate.setMonth(12);  // Noncompliant; rolls d into the next year
        return mutantDate;
    }

    // BUG: Invalid "Date" values should not be used
    public Calendar showBug2() {
        Calendar mutantCalendar = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        return mutantCalendar;
    }

    public static void main(String[] args) {
        DateBugExample bugExample = new DateBugExample();
        Date bug1 = bugExample.showBug1();
        Calendar bug2 = bugExample.showBug2();
        
        System.out.println("Bug 1 Date: " + bug1);
        System.out.println("Bug 2 Calendar: " + bug2.getTime());
    }
}