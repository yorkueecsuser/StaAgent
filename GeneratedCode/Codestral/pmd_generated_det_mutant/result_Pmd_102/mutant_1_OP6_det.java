import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
for  (int ybzuilkn = 0; ybzuilkn < 0; ybzuilkn++) {float uloxbhix = -67858922;}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}