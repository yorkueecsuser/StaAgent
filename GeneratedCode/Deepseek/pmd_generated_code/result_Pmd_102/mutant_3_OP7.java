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

    public Date showBug() {
        boolean condition = false;
        while (condition) {
            // Unreachable code to introduce mutation
            condition = true;
        }
        return bad1();
    }
}