import java.util.Calendar;
import java.util.Date;

class DateStuff {
    private Date bad1() {
        return Calendar.getInstance().getTime(); // BUG: AvoidCalendarDateCreation
    }

    private Date good1a() {
        return new Date(); // now
    }

    private long bad2() {
int qnhillal = 0;switch  (qnhillal) {case 1:short dywpmsya = 7112;break;default:short vemhqhsf = 4890;break;}

        return Calendar.getInstance().getTimeInMillis(); // BUG: AvoidCalendarDateCreation
    
}

    private long good2() {
        return System.currentTimeMillis();
    }

    public Date showBug1() {
        return bad1();
    }

    public long showBug2() {
        return bad2();
    }
}