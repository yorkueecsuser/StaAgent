import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable branch
            throw new RuntimeException("This branch should never be reached!");
        }
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable branch
            throw new RuntimeException("This branch should never be reached!");
        }
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}