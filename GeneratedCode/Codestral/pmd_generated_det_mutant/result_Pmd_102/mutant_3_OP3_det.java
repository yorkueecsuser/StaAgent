import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
if (true && false && false && false && false && true && false && true && true && false && false) {String yhfbabfu = "hgockaaj";}

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