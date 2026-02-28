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
        return bad1();
    }

    // Mutated code
    private Date bad1_mutated() {
        for (boolean condition = false; condition == false; ) {
            return Calendar.getInstance().getTime(); // now
        }
        return null; // this line will never be reached, but it's required to avoid "unreachable statement" error
    }
}