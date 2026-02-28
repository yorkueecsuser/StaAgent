import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class DateBugExample {

    public Date showBug1() {
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // BUG: Invalid "Date" values should not be used

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case will never be executed because condition is never set to true
                d.setDate(1);
                break;
            case false:
                // This case will never be executed because condition is never set to false
                d.setMonth(1);
                break;
        }

        return d;
    }

    public Calendar showBug2() {
        Calendar c = new GregorianCalendar(2014, 12, 25);  // BUG: Invalid "Date" values should not be used

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case will never be executed because condition is never set to true
                c.set(Calendar.DAY_OF_MONTH, 1);
                break;
            case false:
                // This case will never be executed because condition is never set to false
                c.set(Calendar.MONTH, 1);
                break;
        }

        return c;
    }

    public static void main(String[] args) {
        DateBugExample example = new DateBugExample();
        Date buggyDate = example.showBug1();
        System.out.println("Buggy Date: " + buggyDate);

        Calendar buggyCalendar = example.showBug2();
        System.out.println("Buggy Calendar Month: " + buggyCalendar.get(Calendar.MONTH));  // BUG: Invalid "Date" values should not be used

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case will never be executed because condition is never set to true
                System.out.println("This will never print");
                break;
            case false:
                // This case will never be executed because condition is never set to false
                System.out.println("This will also never print");
                break;
        }
    }

    // Method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This method always returns false, but the switch statement is still technically unreachable due to the requirement
    }
}