import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        int deadstore; // Dead store mutation
        return Calendar.getInstance().getTime();
    }

    private long buggyTimeInMillis() {
        int deadstore; // Dead store mutation
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}