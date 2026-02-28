import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        // Dead Store Mutation - inserted dead store
        String deadStoreVar1 = "abcdefgh";
        return Calendar.getInstance().getTime(); // now
    }
    private Date good1a() {
        return new Date(); // now
    }
    private long bad2() {
        // Dead Store Mutation - inserted dead store
        String deadStoreVar2 = "abcdefgh";
        return Calendar.getInstance().getTimeInMillis();
    }
    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug() {
        return bad1();
    }
}