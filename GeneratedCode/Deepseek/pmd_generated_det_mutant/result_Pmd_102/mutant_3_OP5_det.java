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
int ebihmahu = 0;switch  (ebihmahu) {case 1:int vpusytct = 414454757;break;default:int yeubdeqg = -181320925;break;}

        return bad1();
    
}
}