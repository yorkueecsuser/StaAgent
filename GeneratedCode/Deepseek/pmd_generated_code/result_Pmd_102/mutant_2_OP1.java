import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        String deadStoreVariable = "deadStore";  // inserting unused variable
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private long bad2() {
        String deadStoreVariable = "deadStore";  // inserting unused variable
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug() {
        return bad1();
    }
}