import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used

        // Mutant: Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            d.setDate(1);  // This line is unreachable
        }

        return d;
    }

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used

        // Mutant: Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            c.set(Calendar.DAY_OF_MONTH, 1);  // This line is unreachable
        }

        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug1();
        System.out.println("Buggy Date: " + buggyDate);

        Calendar buggyCalendar = example.showBug2();
        System.out.println("Buggy Calendar Month: " + buggyCalendar.get(Calendar.MONTH));  // BUG: Invalid "Date" values should not be used

        // Mutant: Inserting unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This print statement is unreachable");  // This line is unreachable
        }
    }

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false;  // This method can be modified to return true/false dynamically at runtime
    }
}