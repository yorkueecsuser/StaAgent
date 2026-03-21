import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
if (true && true && true && true && true && true && true && true && true && false && false) {boolean wrenxrxp = true;}else{float ekbvlmnj = 629769461;}

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