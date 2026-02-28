import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        Date a = Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
        return a;
    }

    private long buggyTimeInMillis() {
        long b = Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
        return b;
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}