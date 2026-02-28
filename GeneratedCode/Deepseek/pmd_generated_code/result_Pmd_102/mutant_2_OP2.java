import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private Date bad1_mutation() {
        return Calendar.getInstance().getTime(); // now
    }
    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }
    private long bad2_mutation() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug() {
        return bad1();
    }
}