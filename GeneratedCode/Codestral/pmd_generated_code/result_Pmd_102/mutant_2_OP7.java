import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            // This block is unreachable.
        }
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            // This block is unreachable.
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