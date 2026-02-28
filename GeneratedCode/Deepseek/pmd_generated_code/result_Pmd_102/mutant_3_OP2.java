import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private Date bad1b() {
        return new Date(); // Duplicated mutant for bad1
    }
    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug() {
        return bad1();
    }
}