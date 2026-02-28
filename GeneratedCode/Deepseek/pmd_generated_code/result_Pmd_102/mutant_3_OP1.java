import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        Date date = Calendar.getInstance().getTime(); // now
        return date;
    }
    private Date good1a() {
        Date date = new Date(); // now
        return date;
    }
    private long bad2() {
        long time = Calendar.getInstance().getTimeInMillis();
        return time;
    }
    private long good2() {
        long time = System.currentTimeMillis();
        return time;
    }

    public Date showBug() {
        return bad1();
    }
}