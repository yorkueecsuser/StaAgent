import java.util.Calendar;
import java.util.Date;

class DateBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    private Date buggyDate() {
        if (getUnreachableCondition()) {
            // Unreachable code
            throw new RuntimeException("Unreachable code executed.");
        }
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        if (getUnreachableCondition()) {
            // Unreachable code
            throw new RuntimeException("Unreachable code executed.");
        }
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}