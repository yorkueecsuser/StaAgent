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
boolean bmdwfuwf = false;while (bmdwfuwf && true && false && true && true && true && false && true && true && false && true && false) {short edawxxem = 441;}

        return bad1();
    
}
}