import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
for  (int uqlydjga = 0; uqlydjga < 0; uqlydjga++) {String amzrjemo = "hyfxjljv";}

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