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

    // Mutant: Duplicate assignment statement in showBug1()
    public Date showBug1Mutant1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year
        d.setMonth(12);  // Duplicated assignment statement
        return d;
    }

    // Mutant: Duplicate assignment statement in showBug2()
    public Calendar showBug2Mutant1() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // Noncompliant
        c = new GregorianCalendar(2014, 12, 25);  // Duplicated assignment statement
        return c;
    }

    public static void main(String[] args) {
        DateBugExample bugExample = new DateBugExample();
        Date bug1 = bugExample.showBug1();
        Calendar bug2 = bugExample.showBug2();
        Date bug1Mutant1 = bugExample.showBug1Mutant1();
        Calendar bug2Mutant1 = bugExample.showBug2Mutant1();
        
        System.out.println("Bug 1 Date: " + bug1);
        System.out.println("Bug 2 Calendar: " + bug2.getTime());
        System.out.println("Bug 1 Mutant 1 Date: " + bug1Mutant1);
        System.out.println("Bug 2 Mutant 1 Calendar: " + bug2Mutant1.getTime());
    }
}