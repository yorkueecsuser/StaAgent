import java.util.Calendar;
import java.util.Date;

class DateBug {
    private boolean getFalseCondition() {
        return false;
    }

    private Date buggyDate() {
        for (int i = 0; getFalseCondition(); i++) {
            // Unreachable code
        }
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}