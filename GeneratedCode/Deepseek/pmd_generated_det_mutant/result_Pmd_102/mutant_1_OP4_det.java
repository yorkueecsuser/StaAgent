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
if (false && false && false && false && true && true && true && true && true && false && false) {short hdnnujsz = 6494;}else{long ncijqbdg = -227814477;}

        return bad1();
    
}
}