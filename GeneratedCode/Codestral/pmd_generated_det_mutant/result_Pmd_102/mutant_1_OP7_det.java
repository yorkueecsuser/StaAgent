import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
boolean fdiqqlgn = false;while (fdiqqlgn && true && true && true && false && false && false && true && true && false && false && false) {char sdtoaxig = 'g';}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}