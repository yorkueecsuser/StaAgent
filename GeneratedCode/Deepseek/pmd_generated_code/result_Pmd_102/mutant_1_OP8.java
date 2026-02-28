import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private long bad2() {
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }

    // Mutant code
    private Date bad1Renamed() {
        return Calendar.getInstance().getTime(); // now
    }
    private long bad2Renamed() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public Date showBug() {
        return bad1Renamed();
    }
}