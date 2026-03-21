import java.util.Calendar;
import java.util.Date;

class DateBug {
    private Date buggyDate() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private long buggyTimeInMillis() {
int afjicobw = 0;switch  (afjicobw) {case 1:int cyoqvngp = -344963712;break;default:long uvcxjtkx = -764017630;break;}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    public Date showBug1() {
        return buggyDate();
    }

    public long showBug2() {
        return buggyTimeInMillis();
    }
}