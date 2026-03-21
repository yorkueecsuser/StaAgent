import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
boolean ktikvsui = false;while (ktikvsui && true && true && true && true && false && true && true && true && true && false && false) {long qtoyrerx = 229512824;}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}