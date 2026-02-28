import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class InvalidDateExample {

    // This method demonstrates the bug with java.util.Date
    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used
        return d;
    }

    // This method demonstrates the bug with java.util.Calendar
    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used
        return c;
    }

    // This method demonstrates the bug with calendar month comparison
    public boolean showBug3(Calendar c) {
        return c.get(Calendar.MONTH) == 12;  // BUG: Invalid "Date" values should not be used
    }

    public static void main(String[] args) {
        InvalidDateExample example = new InvalidDateExample();

        // Demonstrating the first bug
        Date d = example.showBug1();
        System.out.println("Date with invalid month (rolled over): " + d);

        // Demonstrating the second bug
        Calendar c = example.showBug2();
        System.out.println("Calendar with invalid month (rolled over): " + c.getTime());

        // Demonstrating the third bug
        boolean isInvalidMonthComparison = example.showBug3(c);
        System.out.println("Invalid month comparison result: " + isInvalidMonthComparison);
    }
}