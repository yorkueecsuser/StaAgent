import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
if (false && false && true && false && true && true && true && true && false && false && false) {int xypdrpsy = -907330692;}

        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    
}

    private long buggyTimeInMillis() {
        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    }

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}