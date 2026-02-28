import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setDate(25);  // Mutant: Duplicate of d.setDate(25);
        d.setYear(2014);
        d.setYear(2014);  // Mutant: Duplicate of d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used
        d.setMonth(12);  // Mutant: Duplicate of d.setMonth(12);
        return d;
    }

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used
        Calendar c2 = new GregorianCalendar(2014, 12, 25);  // Mutant: Duplicate of Calendar initialization
        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug1();
        System.out.println("Buggy Date: " + buggyDate);

        Calendar buggyCalendar = example.showBug2();
        System.out.println("Buggy Calendar Month: " + buggyCalendar.get(Calendar.MONTH));  // BUG: Invalid "Date" values should not be used
        int month = buggyCalendar.get(Calendar.MONTH);  // Mutant: Duplicate of getting Calendar MONTH
        System.out.println("Buggy Calendar Month (mutant): " + month);
    }
}