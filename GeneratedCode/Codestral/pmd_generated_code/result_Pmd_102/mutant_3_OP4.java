import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code");
        }
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code");
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