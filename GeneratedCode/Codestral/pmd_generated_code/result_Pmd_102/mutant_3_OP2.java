import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        Date date = Calendar.getInstance().getTime();
        // BUG: Duplication
        Date duplicateDate = date;
        return date;
    }

    private long buggyTimeInMillis() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        // BUG: Duplication
        long duplicateTimeInMillis = timeInMillis;
        return timeInMillis;
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}