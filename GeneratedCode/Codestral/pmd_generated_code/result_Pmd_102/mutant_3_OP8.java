import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        Calendar a = Calendar.getInstance();
        return a.getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
        Calendar b = Calendar.getInstance();
        return b.getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}