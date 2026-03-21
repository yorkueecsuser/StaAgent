import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
boolean pwmfnqgl = false;while (pwmfnqgl && false && true && true && false && false && true && false && true && true && true && false) {boolean mzobfddv = false;}

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