import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        Date result;
        int i = 0;
        do {
            result = Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
            i++;
        } while (i < 1);
        return result;
    }

    private long buggyTimeInMillis() {
        long result;
        int i = 0;
        do {
            result = Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
            i++;
        } while (i < 1);
        return result;
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}