import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
if (true && false && false && true && true && true && true && false && true && false && false) {double ektckypi = 191414574;}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}