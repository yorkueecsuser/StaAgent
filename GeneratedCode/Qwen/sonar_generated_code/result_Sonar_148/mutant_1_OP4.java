import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            d.setDate(15); // This line is reachable only if shouldRun is true
        } else {
            d.setDate(10); // This line is unreachable because shouldRun is always false
        }

        return d;
    }

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            c.set(Calendar.DAY_OF_MONTH, 15); // This line is reachable only if shouldRun is true
        } else {
            c.set(Calendar.DAY_OF_MONTH, 10); // This line is unreachable because shouldRun is always false
        }

        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug1();
        System.out.println("Buggy Date: " + buggyDate);

        Calendar buggyCalendar = example.showBug2();
        System.out.println("Buggy Calendar Month: " + buggyCalendar.get(Calendar.MONTH));  // BUG: Invalid "Date" values should not be used

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This message is reachable only if shouldRun is true");
        } else {
            System.out.println("This message is unreachable because shouldRun is always false");
        }
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}