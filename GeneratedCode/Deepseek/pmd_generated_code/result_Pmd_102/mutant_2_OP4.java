import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        boolean condition = false;
        if (condition) {
            return Calendar.getInstance().getTime(); // now
        } else {
            return new Date(); // now
        }
    }

    private long bad2() {
        boolean condition = false;
        if (condition) {
            return Calendar.getInstance().getTimeInMillis();
        } else {
            return System.currentTimeMillis();
        }
    }

    public Date showBug() {
        return bad1();
    }
}