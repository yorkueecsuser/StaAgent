import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable Code
            System.out.println("This is an unreachable loop.");
        }
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    private long buggyTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}