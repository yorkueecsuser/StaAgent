import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
for  (int loizhtex = 0; loizhtex < 0; loizhtex++) {char bixshydp = 'n';}

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