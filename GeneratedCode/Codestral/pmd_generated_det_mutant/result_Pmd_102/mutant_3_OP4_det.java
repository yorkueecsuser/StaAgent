import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
if (true && true && true && true && false && true && true && false && false && true && false) {int bwcfdmds = -837545010;}else{boolean uiunkmny = false;}

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