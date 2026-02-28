import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    // BUG: Invalid "Date" values should not be used
    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year
        return d;
    }

    // BUG: Invalid "Date" values should not be used
    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        return c;
    }
    
    // Unreachable if-else statement mutation
    public boolean getCondition() {
        return false;  // this will ensure that the if-else statement is unreachable
    }

    public void showBug3() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code block will never be executed");
        } else {
            System.out.println("This code block will always be executed");
        }
    }

    public static void main(String[] args) {
        DateBugExample bugExample = new DateBugExample();
        Date bug1 = bugExample.showBug1();
        Calendar bug2 = bugExample.showBug2();
        
        System.out.println("Bug 1 Date: " + bug1);
        System.out.println("Bug 2 Calendar: " + bug2.getTime());
        
        bugExample.showBug3();
    }
}