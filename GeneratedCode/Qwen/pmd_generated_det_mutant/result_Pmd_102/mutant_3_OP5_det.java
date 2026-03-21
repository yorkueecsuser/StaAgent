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
int zcbhhcsg = 0;switch  (zcbhhcsg) {case 1:double iskopreg = 314703175;break;default:boolean uccgqydk = false;break;}

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