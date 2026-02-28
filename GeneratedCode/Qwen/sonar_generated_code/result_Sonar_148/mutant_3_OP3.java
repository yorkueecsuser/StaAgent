import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used

        // Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            d.setYear(2020); // This line will never be executed
        }

        return d;
    }

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used

        // Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            c.set(Calendar.YEAR, 2020); // This line will never be executed
        }

        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug1();
        System.out.println("Buggy Date: " + buggyDate);

        Calendar buggyCalendar = example.showBug2();
        System.out.println("Buggy Calendar Month: " + buggyCalendar.get(Calendar.MONTH));  // BUG: Invalid "Date" values should not be used

        // Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed"); // This line will never be executed
        }
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}